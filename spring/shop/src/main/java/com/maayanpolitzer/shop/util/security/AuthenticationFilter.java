package com.maayanpolitzer.shop.util.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.maayanpolitzer.shop.models.entities.Authority;
import com.maayanpolitzer.shop.models.entities.Role;
import com.maayanpolitzer.shop.models.entities.User;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private Environment environment;
    private AuthenticationManager authenticationManager;

    public AuthenticationFilter(AuthenticationManager authenticationManager, Environment environment) {
        this.environment = environment;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);

        Authentication authentication = authenticationManager.authenticate(authRequest);
        return authentication;

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

        String[] authorities = new String[authResult.getAuthorities().size()];
        for(int i = 0; i < authorities.length; i++){
            authorities[i] = ((List<Authority>)authResult.getAuthorities()).get(i).getAuthority();
        }

        User user = (User) authResult.getPrincipal();

        String[] roles = new String[user.getRoles().size()];
        List<Role> userRoles = user.getRoles();
        for(int i = 0; i < userRoles.size(); i++){
            roles[i] = userRoles.get(i).getName();
        }
        try {
            Algorithm algorithm = Algorithm.HMAC256(environment.getProperty("jwt.secret"));
            Calendar now = Calendar.getInstance();
            now.add(Calendar.MINUTE, 5);
            String token = JWT.create()
                    .withIssuer("auth0")
                    .withExpiresAt(now.getTime())
                    .withClaim("userId", user.getId())
                    .withClaim("username", user.getUsername())
                    .withClaim("firstName", user.getFirstName())
                    .withClaim("lastName", user.getLastName())
                    .withArrayClaim("authorities", authorities)
                    .withArrayClaim("roles", roles)
                    .sign(algorithm);
            // return the generated access-token to the client.
            response.addHeader("access-token", token);
            response.setStatus(HttpStatus.OK.value());
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
            exception.printStackTrace();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
//        chain.doFilter(request, response);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
    }
}

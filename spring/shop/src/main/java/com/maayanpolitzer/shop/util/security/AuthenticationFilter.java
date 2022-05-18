package com.maayanpolitzer.shop.util.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.maayanpolitzer.shop.util.exceptions.LoginException;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private Environment environment;

    private static final String USERNAME = "maayan";
    private static final String PASSWORD = "qwerty";

    public AuthenticationFilter(Environment environment) {
        this.environment = environment;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        LoginRequest request = new ObjectMapper().readValue(request.getInputStream(), LoginRequest.class);  // get the data from json body

        // obtainUsername && obtainPassword get the data from form-data request body
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        String[] roles = {"seller", "customer", "admin"};

        List<GrantedAuthority> userAuthorities = new ArrayList<>();
        for(String role : roles){
            userAuthorities.add(new SimpleGrantedAuthority(role));
        }

        // TODO: 15/05/2022 check against the users table.
        boolean isUserValid = USERNAME.equals(username) && PASSWORD.equals(password);
        System.out.println("User valid? " + isUserValid);
        if(isUserValid){
            Authentication authentication = new UsernamePasswordAuthenticationToken("123", username, userAuthorities);
            return authentication;
        }
        throw new LoginException();
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        // create access-token (Bearer token)

        String[] authorities = new String[authResult.getAuthorities().size()];
        for(int i = 0; i < authorities.length; i++){
            authorities[i] = ((List) authResult.getAuthorities()).get(i).toString();
        }

        try {
            Algorithm algorithm = Algorithm.HMAC256(environment.getProperty("jwt.secret"));
//            Date now = new Date();
//            now.setMinutes(now.getMinutes() + 5);
            Calendar now = Calendar.getInstance();
            now.add(Calendar.MINUTE, 5);
            String token = JWT.create()
                    .withIssuer("auth0")
                    .withExpiresAt(now.getTime())
                    .withClaim("username", authResult.getCredentials().toString())
                    .withArrayClaim("authorities", authorities)
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

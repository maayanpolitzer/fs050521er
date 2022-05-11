package com.maayanpolitzer.shop.util.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private Environment environment;

    public AuthenticationFilter(Environment environment) {
        this.environment = environment;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        LoginRequest request = new ObjectMapper().readValue(request.getInputStream(), LoginRequest.class);  // get the data from json body

        // obtainUsername && obtainPassword get the data from form-data request body
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        System.out.println(username + ":" + password);

        Authentication authentication = new UsernamePasswordAuthenticationToken("123", username, new ArrayList<>());
        return authentication;
//        throw new LoginException();
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        // create access-token
        try {
            Algorithm algorithm = Algorithm.HMAC256(environment.getProperty("jwt.secret"));
            Date now = new Date();
            now.setMinutes(now.getMinutes() + 5);
            String token = JWT.create()
                    .withIssuer("auth0")
                    .withExpiresAt(now)
                    .withClaim("username", authResult.getCredentials().toString())
                    .sign(algorithm);
            response.addHeader("access-token", token);
            response.setStatus(200);
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
            exception.printStackTrace();
            response.setStatus(500);
        }
        // return the generated access-token to the client.

    }


}

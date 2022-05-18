package com.maayanpolitzer.shop.util.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JWTAuthentication implements Authentication {

    private DecodedJWT jwt;
    private boolean authenticated;

    public JWTAuthentication(String token, Environment environment) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(environment.getProperty("jwt.secret")); //use more secure key
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            this.jwt = jwt;
            this.authenticated = true;
        }catch(JWTVerificationException exception){

        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> userAuthorities = new ArrayList<>();
        for(String role : jwt.getClaim("authorities").asArray(String.class)){
            userAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return userAuthorities;
    }

    @Override
    public Object getCredentials() {
        return jwt.getClaim("username");
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void setAuthenticated(boolean authenticated) throws IllegalArgumentException {
        this.authenticated = authenticated;
    }

    @Override
    public String getName() {
        return "Maayan";
    }
}

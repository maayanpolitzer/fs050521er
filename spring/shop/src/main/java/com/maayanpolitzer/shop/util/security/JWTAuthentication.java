package com.maayanpolitzer.shop.util.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.maayanpolitzer.shop.util.exceptions.TokenVerificationException;
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

    public JWTAuthentication(String token, Environment environment) throws JWTVerificationException {
            Algorithm algorithm = Algorithm.HMAC256(environment.getProperty("jwt.secret")); //use more secure key
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            this.jwt = jwt;
            this.authenticated = true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> userAuthorities = new ArrayList<>();
        for(String role : jwt.getClaim("authorities").asArray(String.class)){
            userAuthorities.add(new SimpleGrantedAuthority(role));
        }
        for(String role : jwt.getClaim("roles").asArray(String.class)){
            userAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return userAuthorities;
    }

    @Override
    public String getCredentials() {
        return "credentials";
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        Claim usernameClaim = jwt.getClaim("username");
        Claim userIdClaim = jwt.getClaim("userId");
//        return jwt.getClaims();
        List<String> shops = new ArrayList<>();
        shops.add("1");
        shops.add("3");
        return new AuthenticatedUser(userIdClaim.asString(), usernameClaim.asString(), shops);
//        return jwt.getClaim("username").toString();
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

package com.maayanpolitzer.shop.util.security;


import com.auth0.jwt.JWT;
import com.maayanpolitzer.shop.util.helperClasses.PermitRoutePair;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter extends BasicAuthenticationFilter {

    private PermitRoutePair[] permittedRoutes;

    public AuthorizationFilter(AuthenticationManager authenticationManager, PermitRoutePair[] permittedRoutes) {
        super(authenticationManager);
        this.permittedRoutes = permittedRoutes;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        for(PermitRoutePair pair: permittedRoutes){
            if(request.getRequestURI().equals(pair.getRoute()) && (pair.getMethod() == null || pair.getMethod().toString().equals(request.getMethod()))){
                chain.doFilter(request, response);
                // authentication not needed.
                return;
            }
        }
        // need to authenticate!
        // if the request has an header with the name "token" => verify the token => push the request to the controller
        String token = request.getHeader("token");
        if(token == null){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return;
        }
        JWT.
    }
}

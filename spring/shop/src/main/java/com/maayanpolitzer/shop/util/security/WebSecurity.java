package com.maayanpolitzer.shop.util.security;

import com.maayanpolitzer.shop.util.helperClasses.PermitRoutePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private Environment environment;
    private PermitRoutePair[] permittedRoutes = {
            new PermitRoutePair(HttpMethod.POST, "/login"),
            new PermitRoutePair(null, "/forgotPassword")
    };

    @Autowired
    public WebSecurity(Environment environment) {
        this.environment = environment;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        for(PermitRoutePair pair : permittedRoutes){
            if(pair.getMethod() == null){
                http.authorizeRequests().antMatchers(pair.getRoute()).permitAll();
            }else{
                http.authorizeRequests().antMatchers(pair.getMethod(), pair.getRoute()).permitAll();
            }
        }
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .addFilter(new AuthenticationFilter(environment))     // login middleware
                .addFilter(new AuthorizationFilter(authenticationManager(), permittedRoutes));// authenticated middleware
        http.csrf().disable();


    }

}

package com.maayanpolitzer.shop.util.security;

import com.maayanpolitzer.shop.services.interfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private Environment environment;
    private BCryptPasswordEncoder passwordEncoder;
    private IUsersService usersService;

    @Autowired
    public WebSecurity(Environment environment, BCryptPasswordEncoder passwordEncoder, IUsersService usersService) {
        this.environment = environment;
        this.passwordEncoder = passwordEncoder;
        this.usersService = usersService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(usersService);
        auth.authenticationProvider(provider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/users").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers("/files/*").permitAll()
                .antMatchers("/forgotPassword/*").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(new AuthenticationFilter(authenticationManager(), environment))     // login middleware
                .addFilter(new AuthorizationFilter(authenticationManager(), environment));// authenticated middleware
        http.csrf().disable();
    }

}

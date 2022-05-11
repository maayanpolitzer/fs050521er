package com.maayanpolitzer.shop.util.exceptions;

import org.springframework.security.core.AuthenticationException;

public class LoginException extends AuthenticationException {

    public LoginException() {
        super("Wrong username and/or password");
    }
}

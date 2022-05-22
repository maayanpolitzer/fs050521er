package com.maayanpolitzer.shop.util.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class TokenVerificationException extends RuntimeException{

    public TokenVerificationException(String message) {
        super(message);
    }
}

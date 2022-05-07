package com.maayanpolitzer.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    private Environment environment;

    @Autowired
    public UsersController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping
    public ResponseEntity getApplicationPropertiesValue(){
        String name = environment.getProperty("app.name");
        return new ResponseEntity(name, HttpStatus.OK);
    }

}

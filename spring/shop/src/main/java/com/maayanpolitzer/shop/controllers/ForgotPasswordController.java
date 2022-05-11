package com.maayanpolitzer.shop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forgotPassword")
public class ForgotPasswordController {

    @GetMapping
    public String resetPassword(){
        return "wiiii";
    }

}

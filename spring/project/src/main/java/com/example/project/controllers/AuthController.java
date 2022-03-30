package com.example.project.controllers;

import com.example.project.models.entities.User;
import com.example.project.models.requests.LoginRequest;
import com.example.project.models.responses.UserResponse;
import com.example.project.services.UsersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public UserResponse login(
            @RequestBody LoginRequest loginRequest
    ){
        User loggedInUser = UsersService.login(loginRequest);
        if(loggedInUser == null){
            return null;
        }
        return new UserResponse(loggedInUser);
    }

}

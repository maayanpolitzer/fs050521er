package com.example.project.controllers;

import com.example.project.models.entities.User;
import com.example.project.models.requests.LoginRequest;
import com.example.project.models.responses.UserResponse;
import com.example.project.repositories.UsersRepository;
import com.example.project.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UsersRepository usersRepository;

    @PostMapping
    public ResponseEntity login(
            @RequestBody LoginRequest loginRequest
    ){
        User loggedInUser = usersRepository.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());
//        User loggedInUser = UsersService.login(loginRequest);

        if(loggedInUser == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);  // HttpStatus.BAD_REQUEST: http response status: 400
        }
        return new ResponseEntity(new UserResponse(loggedInUser) ,HttpStatus.OK);

    }

}

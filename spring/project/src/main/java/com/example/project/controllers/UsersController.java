package com.example.project.controllers;

import com.example.project.models.entities.User;
import com.example.project.models.requests.UserRequest;
import com.example.project.models.responses.UserResponse;
import com.example.project.repositories.UsersRepository;
import com.example.project.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;


@RestController
@RequestMapping("/users2")
public class UsersController {

    // IOC
    @Autowired
    UsersRepository usersRepository;

    @GetMapping
    public ResponseEntity getAllUsers(){
        Iterable<User> users = usersRepository.findAll();
        Iterator<User> iterator = users.iterator();
        ArrayList<UserResponse> responseList = new ArrayList<>();
        while(iterator.hasNext()){
            User user = iterator.next();
            responseList.add(new UserResponse(user));
        }
        return new ResponseEntity(responseList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewUser(
            @RequestBody UserRequest userRequest
            ){
        User user = new User(userRequest);
        usersRepository.save(user);
        return new ResponseEntity(new UserResponse(user), HttpStatus.CREATED);
    }

}

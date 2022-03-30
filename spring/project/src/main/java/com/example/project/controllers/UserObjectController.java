package com.example.project.controllers;

import com.example.project.models.entities.User;
import com.example.project.models.requests.UserRequest;
import com.example.project.models.responses.UserResponse;
import com.example.project.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users2")
public class UserObjectController {

    @GetMapping
    public ArrayList<UserResponse> getAllUsers(){
        ArrayList<UserResponse> responseList = new ArrayList<>();
        for(User user : UsersService.getUsers()){
            responseList.add(new UserResponse(user));
        }
        return responseList;
    }

    @PostMapping
    public UserResponse createNewUser(
            @RequestBody UserRequest userRequest
            ){
        User user = new User(userRequest);
        UsersService.getUsers().add(user);
        return new UserResponse(user);
    }

}

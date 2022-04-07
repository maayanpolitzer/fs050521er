package com.example.repeat.controllers;

import com.example.repeat.models.entities.User;
import com.example.repeat.models.requests.UserRequest;
import com.example.repeat.models.responses.UserResponse;
import com.example.repeat.services.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity getAllUsers(){
        List<User> users = userService.getAllUsers();
        ModelMapper modelMapper = new ModelMapper();
        List<UserResponse> response = modelMapper.map(users, new TypeToken<List<UserResponse>>(){}.getType());
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(
            @PathVariable int id
    ){
        User user = userService.getUserById(id);
        if(user == null){
            // return error!
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        ModelMapper modelMapper = new ModelMapper();
        UserResponse response = modelMapper.map(user, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewUser(
            @RequestBody @Validated UserRequest userRequest
    ){
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userRequest, User.class);
        User newUser = userService.createNewUser(user);
        UserResponse response = modelMapper.map(newUser, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(
            @PathVariable int id,
            @RequestBody UserRequest userRequest
    ){
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userRequest, User.class);
        User updatedUser = userService.updateUserById(id, user);
        UserResponse response = modelMapper.map(updatedUser, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(
            @PathVariable int id
    ){
        User deletedUser = userService.deleteUserById(id);
        if(deletedUser == null){
            // return error!
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        ModelMapper modelMapper = new ModelMapper();
        UserResponse response = modelMapper.map(deletedUser, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.OK);
    }

}

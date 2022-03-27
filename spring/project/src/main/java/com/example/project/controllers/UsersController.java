package com.example.project.controllers;

import com.example.project.models.requests.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;

@RestController
@RequestMapping("/users")
public class UsersController {

    private static ArrayList<String> users = new ArrayList<>();

    // GET http://localhost:8080/users
    @GetMapping
    public ArrayList<String> getAllUsers(){
        return users;
    }

    // GET http://localhost:8080/users/0
    @GetMapping("/{index}")
    public String getUserByIndex(
           @PathVariable int index
    ){
        if(index < users.size()) {
            return users.get(index);
        }
        return null;
    }

    @PostMapping
    public String createNewUser(
        @RequestBody User user
    ){
        users.add(user.getFullName());
        return user.getFullName();
    }

    @DeleteMapping("/{index}")
    public String deleteUserByIndex(
            @PathVariable int index
    ){
        if(index < users.size()){
            String deletedUser = users.remove(index);
            return deletedUser;
        }
        return null;
    }

}

/*
// HTTP REQUEST:
url:            http://localhost:8080
endpoint:       /users
method:         POST
headers:
body:



 */


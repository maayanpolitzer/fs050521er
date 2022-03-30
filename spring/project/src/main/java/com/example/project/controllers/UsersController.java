package com.example.project.controllers;

import com.example.project.models.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    // PUT method usually updates the full MODEL
    @PutMapping("/{index}")
    public String updateUserByIndex(
            @PathVariable int index,
            @RequestBody User user
    ){
        //String originalUser = updateUserByMaayan(index, user);
        String originalUser = users.set(index, user.getFullName());
        return originalUser;
    }

    /*
    private String updateUserByMaayan(int index, User newUser){
        String ou = users.get(index);
        users.remove(index);
        users.add(index, newUser.getFullName());
        return ou;
    }
     */

    // PATCH - can be part of the MODEL
    @PatchMapping("/{index}")
    public String patchUserByIndex(
            @PathVariable int index,
            @RequestBody User user
    ){
        String fullName = users.get(index);
        User currentUser = new User(fullName);
        currentUser.updateUserDetails(user);
        String originalFullName = users.set(index, currentUser.getFullName());
        return originalFullName;
    }


}




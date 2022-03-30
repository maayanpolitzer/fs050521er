package com.example.project.services;

import com.example.project.models.entities.User;
import com.example.project.models.requests.LoginRequest;

import java.util.ArrayList;

public class UsersService {

    private static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getUsers(){
        return users;
    }

    public static User login(LoginRequest loginRequest){
        for(User user: users){
            if(user.equals(loginRequest)){
                return user;
            }
        }
        return null;
    }


}

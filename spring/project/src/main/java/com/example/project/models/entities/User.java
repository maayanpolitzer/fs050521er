package com.example.project.models.entities;

import com.example.project.models.requests.LoginRequest;
import com.example.project.models.requests.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private static int counter = 1;

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public User(String fullName){
        String[] words = fullName.split(" ");
        this.firstName = words[0];
        this.lastName = words[1];
    }

    public User(UserRequest userRequest) {
        this.id = counter++;
        this.email = userRequest.getEmail();
        this.password = userRequest.getPassword();
        this.firstName = userRequest.getFirstName();
        this.lastName = userRequest.getLastName();
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }


    public void updateUserDetails(User newUser){
        if(newUser.getEmail() != null){
            setEmail(newUser.getEmail());
        }
        if(newUser.getPassword() != null){
            setPassword(newUser.getPassword());
        }
        if(newUser.getFirstName() != null){
            setFirstName(newUser.getFirstName());
        }
        if(newUser.getLastName() != null){
            setLastName(newUser.getLastName());
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(obj instanceof LoginRequest){
            LoginRequest temp = (LoginRequest) obj;
            return email.equals(temp.getEmail()) && password.equals(temp.getPassword());
        }
        return false;
    }

}

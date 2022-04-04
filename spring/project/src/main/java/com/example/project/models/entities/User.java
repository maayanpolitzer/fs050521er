package com.example.project.models.entities;

import com.example.project.models.requests.LoginRequest;
import com.example.project.models.requests.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public User(UserRequest userRequest) {
        this.email = userRequest.getEmail();
        this.password = userRequest.getPassword();
        this.firstName = userRequest.getFirstName();
        this.lastName = userRequest.getLastName();
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

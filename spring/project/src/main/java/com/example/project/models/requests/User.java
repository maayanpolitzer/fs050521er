package com.example.project.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

}

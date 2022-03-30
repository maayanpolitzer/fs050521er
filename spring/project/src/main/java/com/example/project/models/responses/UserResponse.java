package com.example.project.models.responses;

import com.example.project.models.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private int id;
    private String email;
    private String firstName;
    private String lastName;

    public UserResponse(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

}

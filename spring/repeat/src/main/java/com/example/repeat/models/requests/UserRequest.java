package com.example.repeat.models.requests;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserRequest {

    @NotNull
    @Length(min = 2, max = 45, message = "First name must be more than 2 characters")
    private String firstName;

    private String lastName;
    @Email
    private String email;

    private String password;

}

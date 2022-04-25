package com.example.requestvalidation.demo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class Person {

    @NotBlank(message = "First name is mandatory, must be provided!")
    @Size(min = 3, max = 15, message = "First name must be between 3 and 15 characters")
    private String firstName;

    @NotBlank(message = "Last name is mandatory, must be provided!")
    @Size(min = 3, max = 15, message = "Last name must be between 3 and 15 characters")
    private String lastName;

    @NotBlank(message = "Email is mandatory, must be provided!")
    @Size(min = 5, max = 45, message = "Email must be between 5 and 45 characters")
    @Email
    private String email;

    @Min(value = 18, message = "Age must be between 18 and 99")
    @Max(value = 99, message = "Age must be between 18 and 99")
    @NotNull(message = "age is mandatory, must be provided!")
    private int age;

}

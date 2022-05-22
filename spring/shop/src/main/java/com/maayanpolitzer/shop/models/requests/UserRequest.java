package com.maayanpolitzer.shop.models.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserRequest {

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private List<Integer> roles;

}

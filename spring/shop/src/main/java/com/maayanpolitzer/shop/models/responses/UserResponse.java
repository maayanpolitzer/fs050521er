package com.maayanpolitzer.shop.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class UserResponse {

    private String id;

    private String firstName;

    private String lastName;

    private String username;

    private List<RoleResponse> roles;

}

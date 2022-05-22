package com.maayanpolitzer.shop.models.dto;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDTO {

    private String id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String encryptedPassword;

    private List<RoleDTO> roles;

}

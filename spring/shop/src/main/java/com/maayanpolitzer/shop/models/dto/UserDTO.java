package com.maayanpolitzer.shop.models.dto;

import com.maayanpolitzer.shop.models.entities.UserRole;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class UserDTO {

    private String id;

    private String firstName;

    private String lastName;

    private List<UserRoleDTO> roles;

}

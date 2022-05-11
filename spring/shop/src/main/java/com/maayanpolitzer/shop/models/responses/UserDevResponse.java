package com.maayanpolitzer.shop.models.responses;

import com.maayanpolitzer.shop.models.dto.UserRoleDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDevResponse extends UserResponse {

     private List<UserRoleDTO> roles;

}

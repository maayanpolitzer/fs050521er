package com.maayanpolitzer.shop.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserProdResponse extends UserResponse {

    private List<UserRoleResponse> roles;

}

package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.UserDTO;

import java.util.List;

public interface IUsersService {

    List<UserDTO> getAll();

}

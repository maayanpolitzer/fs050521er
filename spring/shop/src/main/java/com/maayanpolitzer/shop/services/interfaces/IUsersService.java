package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUsersService extends UserDetailsService {

    List<UserDTO> getAll();

    UserDTO createNewUser(UserDTO userDTO);

    UserDTO findOneById(String id);

}

package com.maayanpolitzer.shop.controllers;

import com.maayanpolitzer.shop.models.dto.ProductDTO;
import com.maayanpolitzer.shop.models.dto.UserDTO;
import com.maayanpolitzer.shop.models.responses.UserDevResponse;
import com.maayanpolitzer.shop.models.responses.UserResponse;
import com.maayanpolitzer.shop.services.interfaces.IUsersService;
import com.maayanpolitzer.shop.util.factories.UserResponseFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private Environment environment;
    private IUsersService usersService;
    private ModelMapper modelMapper;

    private String activeProfile;

    @Autowired
    public UsersController(Environment environment, IUsersService usersService, ModelMapper modelMapper) {
        this.environment = environment;
        this.usersService = usersService;
        this.modelMapper = modelMapper;
        this.activeProfile = environment.getProperty("spring.profiles.active");
    }

    @GetMapping
    public ResponseEntity getAllUsers(){
        List<UserDTO> users = usersService.getAll();
        List<UserResponse> response = UserResponseFactory.getUserResponse(users, modelMapper, activeProfile);
        return new ResponseEntity(response, HttpStatus.OK);
    }

}

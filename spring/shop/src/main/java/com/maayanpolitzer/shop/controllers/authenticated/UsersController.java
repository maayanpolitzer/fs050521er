package com.maayanpolitzer.shop.controllers.authenticated;

import com.maayanpolitzer.shop.models.dto.UserDTO;
import com.maayanpolitzer.shop.models.requests.UserRequest;
import com.maayanpolitzer.shop.models.responses.UserResponse;
import com.maayanpolitzer.shop.services.interfaces.IRolesService;
import com.maayanpolitzer.shop.services.interfaces.IUsersService;
import com.maayanpolitzer.shop.util.factories.UserResponseFactory;
import com.maayanpolitzer.shop.util.security.JWTAuthentication;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private Environment environment;
    private IUsersService usersService;
    private ModelMapper modelMapper;
    private IRolesService rolesService;
    private String activeProfile;

    @Autowired
    public UsersController(Environment environment, IUsersService usersService, ModelMapper modelMapper, IRolesService rolesService) {
        this.environment = environment;
        this.usersService = usersService;
        this.modelMapper = modelMapper;
        this.activeProfile = environment.getProperty("spring.profiles.active");
        this.rolesService = rolesService;
    }

    @PreAuthorize("hasAnyAuthority('seller', 'OP_READ_USERS')")
    @GetMapping
    public ResponseEntity getAllUsers(
            Principal principal
    ){
        System.out.println(principal.getName());
        List<UserDTO> users = usersService.getAll();
        List<UserResponse> response = UserResponseFactory.getUserResponse(users, modelMapper, activeProfile);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity getUserById(
            @PathVariable String id
    ){
        System.out.println(id);
        UserDTO userDTO = usersService.findOneById(id);
        UserResponse response = modelMapper.map(userDTO, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewUser(
            @Valid @RequestBody UserRequest request
    ){
        UserDTO user = modelMapper.map(request, UserDTO.class);
        user.setRoles(rolesService.findAllById(request.getRoles()));
        user = usersService.createNewUser(user);
        UserResponse response = modelMapper.map(user, UserResponse.class);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

}

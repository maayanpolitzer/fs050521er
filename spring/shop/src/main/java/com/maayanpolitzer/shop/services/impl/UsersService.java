package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.UserDTO;
import com.maayanpolitzer.shop.models.entities.User;
import com.maayanpolitzer.shop.repositories.UsersRepo;
import com.maayanpolitzer.shop.services.interfaces.IUsersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UsersService implements IUsersService {

    private UsersRepo usersRepo;
    private ModelMapper modelMapper;
    private BCryptPasswordEncoder passwordEncoder;
    private Environment environment;

    @Autowired
    public UsersService(UsersRepo usersRepo, ModelMapper modelMapper, BCryptPasswordEncoder passwordEncoder, Environment environment) {
        this.usersRepo = usersRepo;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.environment = environment;
    }

    @Override
    public List<UserDTO> getAll() {
        Iterable<User> users = usersRepo.findAll();
        List<User> usersList = new ArrayList<>();
        for(User user : users){
            usersList.add(user);
        }
        return modelMapper.map(usersList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    @Override
    public UserDTO createNewUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        // TODO: 20/05/2022 Check if username is unique.
        user.setId(UUID.randomUUID().toString());
        String encryptedPassword = passwordEncoder.encode(userDTO.getPassword());
        System.out.println("password: " + userDTO.getPassword() + ", encrypted: " + encryptedPassword);
        user.setEncryptedPassword(encryptedPassword);
        usersRepo.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO findOneById(String id) {
        User user = usersRepo.findById(id).orElseThrow();
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersRepo.findByUsername(username);
        return user;
    }
}

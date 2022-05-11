package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.ProductDTO;
import com.maayanpolitzer.shop.models.dto.UserDTO;
import com.maayanpolitzer.shop.models.entities.User;
import com.maayanpolitzer.shop.repositories.UsersRepo;
import com.maayanpolitzer.shop.services.interfaces.IUsersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService implements IUsersService {

    private UsersRepo usersRepo;
    private ModelMapper modelMapper;

    @Autowired
    public UsersService(UsersRepo usersRepo, ModelMapper modelMapper) {
        this.usersRepo = usersRepo;

        this.modelMapper = modelMapper;
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
}

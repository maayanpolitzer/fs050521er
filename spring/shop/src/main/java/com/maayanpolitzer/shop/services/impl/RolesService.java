package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.RoleDTO;
import com.maayanpolitzer.shop.models.entities.Role;
import com.maayanpolitzer.shop.repositories.RolesRepo;
import com.maayanpolitzer.shop.services.interfaces.IRolesService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService implements IRolesService {

    private RolesRepo rolesRepo;
    private ModelMapper modelMapper;

    @Autowired
    public RolesService(RolesRepo rolesRepo, ModelMapper modelMapper) {
        this.rolesRepo = rolesRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RoleDTO> findAllById(List<Integer> ids) {
        Iterable<Role> roles = rolesRepo.findAllById(ids);
        List<RoleDTO> roleDTOS = modelMapper.map(roles, new TypeToken<List<RoleDTO>>(){}.getType());
        return roleDTOS;
    }
}

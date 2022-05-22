package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.RoleDTO;

import java.util.List;

public interface IRolesService {

//    List<RoleDTO> findAll();

    List<RoleDTO> findAllById(List<Integer> ids);



}

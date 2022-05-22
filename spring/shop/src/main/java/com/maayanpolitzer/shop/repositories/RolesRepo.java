package com.maayanpolitzer.shop.repositories;

import com.maayanpolitzer.shop.models.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepo extends CrudRepository<Role, Integer> {
}

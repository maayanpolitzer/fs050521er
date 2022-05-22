package com.maayanpolitzer.shop.repositories;

import com.maayanpolitzer.shop.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CrudRepository<User, String> {

    User findByUsername(String username);
}

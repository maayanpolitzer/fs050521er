package com.example.project.repositories;

import com.example.project.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {

    // JPQL - https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
    //{ SELECT * FROM users WHERE email = ? AND password = ? LIMIT 1;}
    User findByEmailAndPassword(String email, String password);

    
}

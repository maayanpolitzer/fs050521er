package com.example.repeat.repositories;

import com.example.repeat.models.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
    boolean existsByEmail(String email);

    //User findByFirstName(String firstName); // will not work because column first name is not Unique!

    User findByEmailAndPassword(String email, String password);

    /* Native SQL */
    //@Query(native = false, value="SELECT * FROM USERS ")
    //List<User> findAllByFirstNameAndLasNameOrFirstNameAndEmail();

}

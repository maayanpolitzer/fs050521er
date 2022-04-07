package com.example.repeat.services;

import com.example.repeat.models.entities.User;
import com.example.repeat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        Iterable<User> iterable = userRepository.findAll();
        Iterator<User> iterator = iterable.iterator();
        ArrayList<User> users = new ArrayList<>();
        while(iterator.hasNext()){
            User user = iterator.next();
            users.add(user);
        }
        return users;
    }

    public User getUserById(int id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    public User deleteUserById(int id) {
        User user = getUserById(id);
        if(user == null){
            return null;
        }
        userRepository.delete(user);
        return user;
    }

    public User createNewUser(User user) {
        // check if user.getEmail() already in use.
        if(userRepository.existsByEmail(user.getEmail()));
        // save to users table
        User userToAdd = userRepository.save(user);
        return userToAdd;
    }

    public User updateUserById(int id, User user) {
        user.setId(id);
        User updatedUser = userRepository.save(user);
        return updatedUser;
    }
}

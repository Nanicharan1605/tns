package com.example.user.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.repo.UserRepo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    // Add or update a user
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get a single user by ID
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    // Delete a user by ID
    public String deleteUser(Long id) {
        userRepo.deleteById(id);
        return "User removed with id: " + id;
    }
}

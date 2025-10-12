package com.example.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.entity.user;

public interface UserRepo extends JpaRepository<user, Long> {
    // You can add custom queries here if needed
}

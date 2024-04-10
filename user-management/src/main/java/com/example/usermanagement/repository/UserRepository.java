package com.example.usermanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.usermanagement.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}


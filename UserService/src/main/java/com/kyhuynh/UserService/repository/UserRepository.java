package com.kyhuynh.UserService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kyhuynh.UserService.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}

package com.kyhuynh.UserService.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyhuynh.UserService.model.User;
import com.kyhuynh.UserService.repository.UserRepository;
import com.kyhuynh.UserService.service.IUserSerice;

@Service
public class UserService implements IUserSerice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }
}

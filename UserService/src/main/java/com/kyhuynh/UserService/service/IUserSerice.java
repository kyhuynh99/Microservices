package com.kyhuynh.UserService.service;

import java.util.List;

import com.kyhuynh.UserService.model.User;

public interface IUserSerice {

    User getUserById(String id);

    List<User> getAllUsers();

    User createUser(User user);

}

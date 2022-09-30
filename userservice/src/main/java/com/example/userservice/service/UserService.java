package com.example.userservice.service;

import com.example.userservice.Model.Role;
import com.example.userservice.Model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

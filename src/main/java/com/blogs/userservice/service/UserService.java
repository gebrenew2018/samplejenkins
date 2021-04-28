package com.blogs.userservice.service;

import com.blogs.userservice.model.User;

import java.util.List;

public interface UserService {
     User saveUser(User User);
    List<User> getUsers();
    boolean deleteUser(int id);

}

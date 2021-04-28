package com.blogs.userservice.service;

import com.blogs.userservice.model.User;
import com.blogs.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository UserRepository;


    @Override
    public User saveUser(User User) {
        return UserRepository.save(User);
    }

    @Override
    public List<User> getUsers() {
        return UserRepository.findAll();
    }

    @Override
    public boolean deleteUser(int id) {
        boolean status = true;
        try{
            UserRepository.deleteById(id);
        } catch (Exception ex){
            status = false;
        }
        return status;
    }
}

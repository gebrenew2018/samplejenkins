package com.blogs.userservice.controller;

import com.blogs.userservice.model.User;
import com.blogs.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping()
    public List<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/add")
    public User saveUser(@RequestBody User User){
        User saveUser = service.saveUser(User);
        return saveUser;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id){
        boolean deleted = service.deleteUser(id);
        if(deleted){
            return "User successfully deleted.";
        }
        return "There is some problem with deletion. Try again later.";
    }

}

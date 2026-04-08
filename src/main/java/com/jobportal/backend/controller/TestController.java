package com.jobportal.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jobportal.backend.User;
import com.jobportal.backend.repository.UserRepository;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Backend working 🚀";
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        return userRepository.save(user);
    }
}
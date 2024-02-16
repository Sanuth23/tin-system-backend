package org.example.controller;

import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/user")
    UserEntity createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping("/user/{id}")
    String generateTin(@PathVariable Long id){
        return service.generateTin(id);
    }

}

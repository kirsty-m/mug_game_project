package com.muggame.mug.controllers;

import com.muggame.mug.models.User;
import com.muggame.mug.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/users")
    public ResponseEntity postUser(@RequestBody User user) {
        userRepository.save(user); // Use the instance of UserRepository
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}

package com.muggame.mug.controllers;

import com.muggame.mug.models.User;
import com.muggame.mug.models.items.Item;
import com.muggame.mug.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<User> getAllUsers(@RequestParam(name="email", required = false) String emailAddress) {
        if (emailAddress != null) {
            User selectedUser = userRepository.findByEmailAddress(emailAddress);
            return new ResponseEntity<>(selectedUser, HttpStatus.OK);
        }

        return null;
//        else{
//            return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
//        }
    }
    @PostMapping(value = "/users")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity postUser(@RequestBody User user) {
        userRepository.save(user); // Use the instance of UserRepository
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}

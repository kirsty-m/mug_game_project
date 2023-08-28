package com.muggame.backend.controllers;

import com.muggame.backend.models.PlayerCharacter;
import com.muggame.backend.repositories.PlayerCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerCharacterController {

    @Autowired
    PlayerCharacterRepository playerCharacterRepository;

    @GetMapping(value = "/playercharacters")
    public ResponseEntity<List<PlayerCharacter>> getAllPlayerCharacters () {
        return new ResponseEntity<>(playerCharacterRepository.findAll(), HttpStatus.OK);
    }
}

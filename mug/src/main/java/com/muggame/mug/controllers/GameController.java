package com.muggame.mug.controllers;

import com.muggame.mug.models.Game;
import com.muggame.mug.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/games")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Game>> getAllGames() {
        return new ResponseEntity<>(gameRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/games/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity getGame(@PathVariable Long id) {
        return new ResponseEntity(gameRepository.findById(id), HttpStatus.OK);
    }
}

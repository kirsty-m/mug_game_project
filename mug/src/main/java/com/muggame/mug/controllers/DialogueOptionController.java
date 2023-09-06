package com.muggame.mug.controllers;

import com.muggame.mug.models.DialogueOption;
import com.muggame.mug.models.Game;
import com.muggame.mug.repositories.DialogueOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DialogueOptionController {

    @Autowired
    DialogueOptionRepository dialogueOptionRepository;

    @GetMapping(value = "/dialogue_options")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<DialogueOption>> getAllGames() {
        return new ResponseEntity<>(dialogueOptionRepository.findAll(), HttpStatus.OK);
    }
}

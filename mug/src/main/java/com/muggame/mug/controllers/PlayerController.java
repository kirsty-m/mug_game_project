package com.muggame.mug.controllers;

import com.muggame.mug.models.Player;
import com.muggame.mug.models.items.Item;
import com.muggame.mug.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(value = "/players")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Item>> getAllPlayers() {
        return new ResponseEntity(playerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "players/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity getPirate(@PathVariable Long id) {
        return new ResponseEntity<>(playerRepository.findById(id), HttpStatus.OK);
    }


    @PostMapping(value = "/players")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> createPlayer(@RequestBody Map<String, String> playerInfo) {
        String playerName = playerInfo.get("name");
        Player player = new Player(playerName);

        try {
            playerRepository.save(player);
            return ResponseEntity.ok("Player created successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating player.");
        }
    }
}


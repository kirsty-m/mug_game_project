package com.muggame.mug.controllers;
import com.muggame.mug.models.Location;
import com.muggame.mug.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LocationController
{
    @Autowired
    LocationRepository locationRepository;

    @GetMapping(value = "/locations")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Location>> getAlLocations()
    {
        return new ResponseEntity<>(locationRepository.findAll(), HttpStatus.OK);
    }
}

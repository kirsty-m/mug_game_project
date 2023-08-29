package com.muggame.backend.models;

import javax.persistence.OneToOne;
import java.util.HashMap;
import java.util.List;

public class Scenario {

    private Long id;
    private String name;
    private String scenario;
    private HashMap<String> playerChoices;

    @OneToOne
    private Location location;

    public Scenario(String name, String scenario, Location location) {
        this.name = name;
        this.scenario = scenario;
        this.location = location;
    }
}

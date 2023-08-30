package com.muggame.backend.models;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.HashMap;
import java.util.List;

public class Scenario {

    private Long id;
    private String name;
    private String scenario;
    private HashMap<Integer, String> playerChoices;
    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    public Scenario(String name, String scenario, Location location) {
        this.name = name;
        this.scenario = scenario;
        this.location = location;
        this.playerChoices = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public HashMap<Integer, String> getPlayerChoices() {
        return playerChoices;
    }

    public void setPlayerChoices(HashMap<Integer, String> playerChoices) {
        this.playerChoices = playerChoices;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

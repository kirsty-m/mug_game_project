package com.muggame.backend.models;

import java.util.ArrayList;
import java.util.HashMap;

public class playerCharacter {

    private Long id;
    private String name;
    private ArrayList<String> inventory;
    private HashMap<String, Integer> attributes;
    private String statusEffect;

    public playerCharacter(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.attributes = new HashMap<>();
        attributes.put("Strength", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Luck", 0);
        this.statusEffect = null;
    }
}

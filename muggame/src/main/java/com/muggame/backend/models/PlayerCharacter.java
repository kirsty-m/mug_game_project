package com.muggame.backend.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;


@Entity
@Table(name="playerCharacters")
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="inventory")
    private ArrayList<String> inventory;

    @Column(name="attributes")
    private HashMap<String, Integer> attributes;

    @Column(name="statusEffect")
    private String statusEffect;

    public PlayerCharacter(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.attributes = new HashMap<>();
        attributes.put("Strength", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Luck", 0);
        this.statusEffect = null;
    }

    public PlayerCharacter(){}
}

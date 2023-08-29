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
    @Column(name="strength")
    private int strength;
    @Column(name="intelligence")
    private int intelligence;
    @Column(name="luck")
    private int luck;
    @Column(name="statusEffect")
    private String statusEffect;

    public PlayerCharacter(String name) {
        this.name = name;
        this.strength = 0;
        this.intelligence = 0;
        this.luck = 0;
        this.statusEffect = null;
    }

    public PlayerCharacter(){}

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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getStatusEffect() {
        return statusEffect;
    }

    public void setStatusEffect(String statusEffect) {
        this.statusEffect = statusEffect;
    }
}

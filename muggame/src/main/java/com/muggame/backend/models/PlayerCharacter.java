package com.muggame.backend.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Entity
@Table(name="player_characters")
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="statusEffect")
    private String statusEffect;
    @Column
    private List<IItem> inventory;


    public PlayerCharacter(String name) {
        this.name = name;
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


    public String getStatusEffect() {
        return statusEffect;
    }

    public void setStatusEffect(String statusEffect) {
        this.statusEffect = statusEffect;
    }

}

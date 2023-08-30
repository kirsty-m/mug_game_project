package com.muggame.backend.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "non_player_character")
public class NonPlayerCharacter {

    private Long id;
    private String name;

}

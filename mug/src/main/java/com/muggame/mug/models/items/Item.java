package com.muggame.mug.models.items;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.muggame.mug.models.Location;
import com.muggame.mug.models.Player;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "players_items",
            joinColumns = {@JoinColumn(
                    name = "item_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "player_id"
            )}
    )
    private List<Player> players;

    @JsonIgnoreProperties({"items"})
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = true)
    private Location location;



    public Item(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.players = new ArrayList<>();
    }

    public Item(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}


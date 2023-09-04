package com.muggame.mug.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"games"})
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    @JsonIgnoreProperties({"games"})
    @ManyToOne
    private Player player;

//    @JsonIgnoreProperties({"games"})
    @ManyToOne
    private Location location;

    public Game() {
    }

    public Game(User user, Player player, Location location) {
        this.user = user;
        this.player = player;
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

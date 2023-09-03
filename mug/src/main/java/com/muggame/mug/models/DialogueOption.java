package com.muggame.mug.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;

@Entity
@Table(name="dialogue_options")
public class DialogueOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="next_id")
    private Long nextId;

    @Column(name="dialogue")
    private String dialogue;

    @Column(name="response_text")
    private String responseText;

    @JsonIgnoreProperties({"dialogue_options"})
    @ManyToOne
    @JoinColumn(
            name = "location_id", nullable = true
    )
    private Location location;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "players_dialogueoptions",
            joinColumns = {@JoinColumn(
                    name = "dialogue_option_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "player_id"
            )}
    )
    private List<Player> players;



    public DialogueOption(Long nextId, String dialogue, String responseText, Location location) {
        this.nextId = nextId;
        this.dialogue = dialogue;
        this.responseText = responseText;
        this.location = location;
        this.players = new ArrayList<>();
    }

    public DialogueOption() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
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

    public void addPlayer(Player player) {

    }
}

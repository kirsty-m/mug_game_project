package com.muggame.mug.models;

import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(
            name = "location_id", nullable = true
    )
    private Location location;

    @ManyToOne
    @JoinColumn(
            name = "player_id"
    )
    private Player player;



    public DialogueOption(Long nextId, String dialogue, String responseText, Location location, Player player) {
        this.nextId = nextId;
        this.dialogue = dialogue;
        this.responseText = responseText;
        this.location = location;
        this.player = player;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

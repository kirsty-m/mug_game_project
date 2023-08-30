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


    public DialogueOption(Long nextId, String dialogue, String responseText, Location location) {
        this.nextId = nextId;
        this.dialogue = dialogue;
        this.responseText = responseText;
        this.location = location;
    }

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
}

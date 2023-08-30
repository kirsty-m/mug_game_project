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

    @ManyToOne
    @JoinColumn(
            name = "location_id", nullable = false
    )
    private Location location;


    public DialogueOption(Long nextId, String dialogue) {
        this.nextId = nextId;
        this.dialogue = dialogue;
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

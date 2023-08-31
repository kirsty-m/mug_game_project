package com.muggame.mug.models;

import com.muggame.mug.models.items.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "location")
    private List<Item> items;

    @OneToMany(mappedBy = "location")
    private List<DialogueOption> dialogueOptions;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.dialogueOptions = new ArrayList<DialogueOption>();
    }

    public Location() {}

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

//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }

    public List<DialogueOption> getDialogueOptions() {
        return dialogueOptions;
    }

    public void setDialogueOptions(List<DialogueOption> dialogueOptions) {
        this.dialogueOptions = dialogueOptions;
    }
}

package com.muggame.mug.models;

import com.muggame.mug.models.items.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "player")
    private List<Item> inventory;

    @OneToMany(mappedBy = "player")
    private List<DialogueOption> selectedDialogueOptions;

    public Player(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.selectedDialogueOptions = new ArrayList<>();
    }

    public Player() {};

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

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<DialogueOption> getSelectedDialogueOptions() {
        return selectedDialogueOptions;
    }

    public void setSelectedDialogueOptions(List<DialogueOption> selectedDialogueOptions) {
        this.selectedDialogueOptions = selectedDialogueOptions;
    }

    public void addToSelectedDialogueOptions(DialogueOption dialogueOption){
        selectedDialogueOptions.add(dialogueOption);
    }



}

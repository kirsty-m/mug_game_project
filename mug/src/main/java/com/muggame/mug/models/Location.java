package com.muggame.mug.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.muggame.mug.models.items.Item;
import org.hibernate.annotations.Cascade;

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

    @JsonIgnoreProperties({"locations"})
    @ManyToMany
    @JoinTable(
            name = "locations_adjacentlocations",
            joinColumns = {@JoinColumn(
                    name = "location_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "adjacentlocation_id"
            )}
    )
    private List<Location> adjacentLocations;

    @JsonManagedReference(value = "location-item")
    @OneToMany(mappedBy = "location")
    private List<Item> items;

    @JsonManagedReference(value = "location-dialogue")
    @OneToMany(mappedBy = "location")
    private List<DialogueOption> dialogueOptions;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.dialogueOptions = new ArrayList<>();
        this.items = new ArrayList<>();
        this.adjacentLocations = new ArrayList<>();
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


    public List<DialogueOption> getDialogueOptions() {
        return dialogueOptions;
    }

    public void setDialogueOptions(List<DialogueOption> dialogueOptions) {
        this.dialogueOptions = dialogueOptions;
    }

    public void addDialogueOption(DialogueOption dialogueOption) {
        this.dialogueOptions.add(dialogueOption);
    }

    public void removeDialogueOptions(DialogueOption dialogueOption) {
        this.dialogueOptions.remove(dialogueOption);
    }

    public List<Location> getAdjacentLocations() {
        return adjacentLocations;
    }

    public void setAdjacentLocations(List<Location> adjacentLocations) {
        this.adjacentLocations = adjacentLocations;
    }

    public void addAdjacentLocation(Location location){
        this.adjacentLocations.add(location);
    }

    public void removeAdjacentLocation(Location location){
        this.adjacentLocations.remove(location);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}

package com.muggame.mug.models.items;

import com.muggame.mug.models.Location;

import javax.persistence.*;

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

    @Column
    private Boolean inInventory;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = true)
    private Location location;



    public Item(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.inInventory = false;
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

    public Boolean getInInventory() {
        return inInventory;
    }

    public void setInInventory(Boolean inInventory) {
        this.inInventory = inInventory;
    }
}


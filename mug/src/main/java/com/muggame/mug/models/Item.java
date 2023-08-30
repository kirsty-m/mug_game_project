package com.muggame.mug.models;

import javax.persistence.*;

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "location_id", nullable = false)
//    private Location location;



    public Item(String name) {
        this.name = name;
    }

    public Item(){}


}


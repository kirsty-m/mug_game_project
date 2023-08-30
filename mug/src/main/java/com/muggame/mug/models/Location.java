package com.muggame.mug.models;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
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
    }
}

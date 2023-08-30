package com.muggame.backend.models;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<String> items;
    private String areaDescription;

    public Location(String name, String areaDescription) {
        this.name = name;
        this.areaDescription = areaDescription;
    }
}

package com.muggame.backend.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {

    private Long id;
    private String name;
    private ArrayList<String> items;
    private String areaDescription;
    private HashMap<String, Boolean> playerChoices;
}

package Locations;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {

    private Long id;
    private String name;
    private HashMap<String, Boolean> allChoices;
    private ArrayList<String> availableChoices;

    private NPC npc;
}

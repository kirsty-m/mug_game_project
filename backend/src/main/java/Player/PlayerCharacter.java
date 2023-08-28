package Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerCharacter {

    private Long id;
    private String name;
    private ArrayList<Item> inventory;
    private HashMap<String, Integer> attributes;
    private String statusEffect;


    public PlayerCharacter(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.attributes = new HashMap<>();
        attributes.put("Strength", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Luck", 0);
        this.statusEffect = null;
    }

    public PlayerCharacter() {
    }
}

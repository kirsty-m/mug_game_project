package com.muggame.mug.models;

import java.util.List;

public class Player {
    private Long id;
    private String name;
    private List<Item> inventory;
    private List<DialogueOption> selectedDialogueOptions;

    public Player(String name) {
        this.name = name;
    }
}

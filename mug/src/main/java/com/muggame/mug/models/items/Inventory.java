package com.muggame.mug.models.items;

import com.muggame.mug.models.Player;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "inventory")
public class Inventory  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public Inventory(Player player) {
        this.player = player;
    }

    public Inventory() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

package com.muggame.mug.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "username")
    private String username;

//    @OneToMany
//    private Game game;


    public User(String emailAddress, String username) {
        this.emailAddress = emailAddress;
        this.username = username;
//        this.game = game;
    }

    public User(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
}

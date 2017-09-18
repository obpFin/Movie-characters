package com.obpFi.moviecharacters;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Character {

    private @Id @GeneratedValue Long Id;
    private String firstName;
    private String lastName;
    private String description;
    private String imgUrl;

    private Character() {}

    public Character(String firstName, String lastName, String description, String imgUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.imgUrl = imgUrl;
    }
}

package com.obpFi.moviecharacters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CharacterRepository repository;

    @Autowired
    public DatabaseLoader(CharacterRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Character("Indiana","Jones","Dr. Henry Walton \"Indiana\" Jones, Jr. is a title character and protagonist of the Indiana Jones franchise.","https://upload.wikimedia.org/wikipedia/en/8/8e/Indiana_Jones_in_Raiders_of_the_Lost_Ark.jpg"));
    }

}

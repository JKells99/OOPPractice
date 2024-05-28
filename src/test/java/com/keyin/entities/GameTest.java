package com.keyin.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class GameTest {


    @Test
    public void testGameCreation(){
        List<Publisher> publisherList = new ArrayList<>();
        List<Game> gameList = new ArrayList<>();
        Publisher publisher = new Publisher("EA","LA",32000000);
        publisherList.add(publisher);
        Genre genre = new Genre("Action");

        Game game = new Game("BattleField","September 21st 2014",publisherList,genre);

        gameList.add(game);

        Assertions.assertFalse(gameList.size() == 0);




    }


}

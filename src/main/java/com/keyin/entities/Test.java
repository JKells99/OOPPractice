package com.keyin.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Publisher> publisherList = new ArrayList<>();


        Publisher publisher = new Publisher("EA","LA",32000000);
        Publisher publisher2 = new Publisher("Dice","YYT",32000000);
        publisherList.add(publisher);
        publisherList.add(publisher2);





        Genre genre = new Genre("Action");

        Game game = new Game("BattleField","September 21st 2014",publisherList,genre);
        System.out.println("Game Title: " + game.getGameTitle());

        System.out.println(game.printPublishers());




    }


}

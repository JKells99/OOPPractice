package com.keyin.entities;

import java.util.List;

public class Game {

    private String gameTitle;

    private String releaseDate;

    private List< Publisher> publishers;

    private Genre genre;

    public Game(String gameTitle, String releaseDate, List<Publisher> publishers, Genre genre) {
        this.gameTitle = gameTitle;
        this.releaseDate = releaseDate;
        this.publishers = publishers;
        this.genre = genre;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher printPublishers() {
        System.out.print("Pub Names: ");
        if (publishers == null || publishers.isEmpty()) {
            System.out.println("No publishers available.");
            return null;

        }
        for (Publisher publisher : publishers) {
            System.out.print(publisher.getPublisherName() + ", ");
        }
        System.out.println(); // Print a new line after printing all publishers

        return (Publisher) publishers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameTitle='" + gameTitle + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", publishers=" + publishers +
                ", genre=" + genre +
                '}';
    }
}

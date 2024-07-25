package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor to initialize show name, number of episodes, and genre
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter to get the show name
    public String getShowName() {
        return showName;
    }

    // Getter to get the number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter to get the genre
    public String getGenre() {
        return genre;
    }

    // Overriding the toString() method to print TV show details
    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenre();
    }
}

package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Name of the show: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.print("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            // Add the TvShow object to the list
            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        // Print the TV show objects
        System.out.println();
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();
    }
}

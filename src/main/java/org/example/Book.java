package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor to initialize title, number of pages, and publication year
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Getter to get the title
    public String getTitle() {
        return title;
    }

    // Getter to get the number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Getter to get the publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Overriding the toString() method to print book details
    @Override
    public String toString() {
        return getTitle() + ", " + getNumberOfPages() + " pages, " + getPublicationYear();
    }
}

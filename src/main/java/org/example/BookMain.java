package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title (empty will stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            // Add the Book object to the list
            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        System.out.println();
        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }

}

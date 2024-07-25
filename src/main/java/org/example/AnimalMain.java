package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogInput = scanner.nextLine().trim().toLowerCase();
            boolean isDog = isDogInput.equals("yes");

            // Add the Animal object to the list
            animals.add(new Animal(name, isDog));
        }

        // Print the animal objects
        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}


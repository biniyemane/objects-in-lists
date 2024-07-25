package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor to initialize name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter to get the name
    public String getName() {
        return name;
    }

    // Getter to get if the animal is a dog or not
    public boolean getIsDog() {
        return isDog;
    }

    // Overriding the toString() method to print animal details
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

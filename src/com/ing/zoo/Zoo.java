package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ing.zoo.animals.*;
import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Zoo {

    public static void main(String[] args) {

        List<Animal> animals = createAnimals();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a command: ");
            String input = scanner.nextLine().trim();

            if (input.isBlank()) {
                System.out.println("Please enter a command.");
                return;
            }

            processCommand(input, animals);
        }
    }

    private static List<Animal> createAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));

        return animals;
    }

    private static void processCommand(String input, List<Animal> animals) {
        String[] parts = input.split("\\s+");

        switch (parts[0].toLowerCase()) {

            case "hello":
                handleHello(parts, animals);
                break;

            case "give":
                handleGive(parts, animals);
                break;

            case "perform":
                handlePerform(parts, animals);
                break;

            default:
                System.out.println("Unknown command.");
        }
    }

    private static void handleHello(String[] parts, List<Animal> animals) {

        if (parts.length == 1) {
            for (Animal animal : animals) {
                animal.sayHello();
            }
            return;
        }

        String animalName = parts[1];

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                animal.sayHello();
                return;
            }
        }

        System.out.println("Animal not found.");
    }

    private static void handleGive(String[] parts, List<Animal> animals) {

        if (parts.length < 2) {
            System.out.println("Usage: give meat | give leaves");
            return;
        }

        switch (parts[1].toLowerCase()) {

            case "meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore carnivore) {
                        carnivore.eatMeat();
                    }
                }
                break;

            case "leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore herbivore) {
                        herbivore.eatLeaves();
                    }
                }
                break;

            default:
                System.out.println("Unknown food.");
        }
    }

    private static void handlePerform(String[] parts, List<Animal> animals) {

        if (parts.length != 2 || !parts[1].equalsIgnoreCase("trick")) {
            System.out.println("Usage: perform trick");
            return;
        }

        for (Animal animal : animals) {
            if (animal instanceof TrickAnimal trickAnimal) {
                trickAnimal.performTrick();
            }
        }
    }
}
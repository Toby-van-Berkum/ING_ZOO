package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ing.zoo.animals.Animal.Animal;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new  ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0] + " henk"))
        {
            for(Animal animal : animals) 
            {
                if(animal.getName().equalsIgnoreCase("henk"))
                {
                    animal.sayHello();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
        scanner.close();
    }
}

package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Zebra extends Animal implements Herbivore, TrickAnimal{
    private String helloText;
    private String eatText;
    private String trick;

    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "snoozes standing up";
        }
        else
        {
            trick = "runs zigzag";
        }
        System.out.println(trick);
    }
}

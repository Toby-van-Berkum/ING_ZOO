package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Omnivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Pig extends Animal implements Omnivore, TrickAnimal{
    private String helloText;
    private String eatText;
    private String trick;

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}

package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Tiger extends Animal implements Carnivore, TrickAnimal{
    private String helloText;
    private String eatText;
    private String trick;

    public Tiger(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}

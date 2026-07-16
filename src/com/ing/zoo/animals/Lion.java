package com.ing.zoo.animals;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore{
    private String helloText;
    private String eatText;

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}

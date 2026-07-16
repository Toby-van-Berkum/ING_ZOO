package com.ing.zoo.animals;

import com.ing.zoo.animals.Animal.Animal;

public class Hippo extends Animal{
    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}

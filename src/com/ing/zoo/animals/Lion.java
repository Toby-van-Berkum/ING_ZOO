package com.ing.zoo.animals;

import com.ing.zoo.animals.Animal.Animal;

public class Lion extends Animal {
    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}

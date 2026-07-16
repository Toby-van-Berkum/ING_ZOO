package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Crocodile extends Animal implements Carnivore, TrickAnimal {
	private String helloText;
	private String eatText;
	private String trick;

	public Crocodile(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		helloText = "Sni sna snapperdesnap";
		System.out.println(helloText);
	}

	@Override
	public void eatMeat() {
		eatText = "Chomp chomp!";
		System.out.println(eatText);
	}

	@Override
	public void performTrick() {
		Random random = new Random();
		int rnd = random.nextInt(2);
		if (rnd == 0) {
			trick = "does a barrelroll";
		} else {
			trick = "cries fake tears";
		}
		System.out.println(trick);
	}
}

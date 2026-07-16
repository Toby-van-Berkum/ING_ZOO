package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.Animal.Animal;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickAnimal;

public class Ostrich extends Animal implements Herbivore, TrickAnimal {
	private String helloText;
	private String eatText;
	private String trick;

	public Ostrich(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		helloText = "Hisssssss";
		System.out.println(helloText);
	}

	@Override
	public void eatLeaves() {
		eatText = "Munch munch";
		System.out.println(eatText);
	}

	@Override
	public void performTrick() {
		Random random = new Random();
		int rnd = random.nextInt(2);
		if (rnd == 0) {
			trick = "puts head in the ground";
		} else {
			trick = "runs with the zoomies";
		}
		System.out.println(trick);
	}
}

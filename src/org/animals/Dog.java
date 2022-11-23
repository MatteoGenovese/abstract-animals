package org.animals;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("croquettes");
	}

	@Override
	public void animalSound() {
		System.out.println("baubaubau");
	}

}

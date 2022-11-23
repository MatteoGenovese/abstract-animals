package org.animals;

public class Sparrow extends Animal implements IFlying{

	@Override
	public void eat() {
		System.out.println("insects");		
	}

	@Override
	public void animalSound() {
		System.out.println("cipcipcip");
	}

	@Override
	public void fly() {
		System.out.println("I'm flyiiiiing");		
	}

}

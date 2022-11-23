package org.animals;

public class Eagle extends Animal implements IFlying{

	@Override
	public void eat() {
		System.out.println("meat");
		
	}

	@Override
	public void animalSound() {
		System.out.println("iiiiiiiiiiiaiiiiiiiiiiiia");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flyiing");		
	}


}

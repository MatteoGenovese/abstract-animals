package org.animals;

public class Dolphin extends Animal implements ISwimming{

	@Override
	public void eat() {
		System.out.println("fishs");		
	}

	@Override
	public void animalSound() {
		System.out.println("cricricricri");
		
	}

	@Override
	public void swim() {
		System.out.println("I'm swimiing");		
		
	}
	
	
	



}

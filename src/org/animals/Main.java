package org.animals;

public class Main {

	public static void main(String[] args) {
		
		
		Eagle e = new Eagle();
		e.eat();
		e.animalSound();
		e.sleep();
		
		System.out.println("--------------------------------");
		
		Dog dg= new Dog();
		dg.eat();
		dg.animalSound();
		dg.sleep();
		
		System.out.println("--------------------------------");
		
		Sparrow s = new Sparrow();
		s.eat();
		s.animalSound();
		s.sleep();
		
		System.out.println("--------------------------------");
		
		Dolphin dn = new Dolphin();
		dn.eat();
		dn.animalSound();
		dn.sleep();
		
		System.out.println("--------------------------------");
		
		doFly(e);
		doFly(s);
		
		doSwim(dn);
	}
	private static void doFly( IFlying animaleVolante ) {
		
		animaleVolante.fly();
	}
	private static void doSwim( ISwimming animaleNuotante ) {
		
		animaleNuotante.swim();
	}

}

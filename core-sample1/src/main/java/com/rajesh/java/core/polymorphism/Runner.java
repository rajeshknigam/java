package com.rajesh.java.core.polymorphism;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------");
		System.out.println("Running the Cat instance now...");
		Animal cat = new Cat();
		cat.doTalking();
		cat.doWalking();

		System.out.println("--------------------------------------------");
		System.out.println("Running the Dog instance now...");
		Animal dog = new Dog();
		dog.doTalking();
		dog.doWalking();
	}

}

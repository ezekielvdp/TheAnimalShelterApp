package com.pointwest.training.beans;

public class Dog extends Animal {
	
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}

	// Print Greetings
	@Override
	public void displayGreetings() {
		System.out.println("[" + refId + "] Arf! I'm " + animalName + ", " + animalAge + "yrs. old.");
	}
}

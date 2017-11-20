package com.pointwest.training.beans;

public class Cat extends Animal {

	public Cat(String name, int age, String gender) {
		super(name, age, gender);
	}

	// Print Greetings
	@Override
	public void displayGreetings() {
		System.out.println("[" + refId + "] Meow! I'm " + animalName + ", " + animalAge + "yrs. old.");
	}
}

package com.pointwest.training.beans;

public class Parrot extends Animal {

	public Parrot(String name, int age, String gender) {
		super(name, age, gender);
	}

	// Print Greetings
	@Override
	public void displayGreetings() {
		System.out.println("[" + refId + "] ARR! I'm " + animalName + ", " + animalAge + "yrs. old.");
	}
}

package com.pointwest.training.beans;

public abstract class Animal {
	// counter for refId
	protected static int refIdCtr = 0;

	// Properties of animals
	protected int refId;
	protected String animalName;
	protected int animalAge;
	protected String animalGender;

	// Constructor
	protected Animal(String name, int age, String gender) {
		// Add counter for refId, then put it to its refId
		this.refId = ++refIdCtr;
		
		this.animalName = name;
		this.animalAge = age;
		this.animalGender = gender;
	}

	public abstract void displayGreetings();
	
	public int getRefId() {
		return this.refId;
	}
}

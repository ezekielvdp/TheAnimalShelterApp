package com.pointwest.training.service;

import java.util.List;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.beans.Cat;
import com.pointwest.training.beans.Dog;
import com.pointwest.training.beans.Parrot;
import com.pointwest.training.constants.MenuConstant;
import com.pointwest.training.ui.AddMenuUI;

public class AddAnimalService {
	protected static List<Animal> addAnimal(List<Animal> listOfAnimals) {
		// Instantiate AddMenuUI
		AddMenuUI addMenu = new AddMenuUI();
		
		// Pick type of animal
		String choice = addMenu.displayAddMenu();
		Animal animal = null;
		
		boolean isValidChoice = "1".equals(choice) ||
								"2".equals(choice) ||
								"3".equals(choice);
		
		String name = "";
		int age = 0;
		String gender = "";
		
		if(isValidChoice) {
			// Enter getName, getAge, getGender
			name = addMenu.setName();
			age = addMenu.setAge();
			gender = addMenu.setGender();
		}
		
		// [1] - Dog, [2] - Cat, [3] - Parrot
		switch(choice) {
		case "1":
			animal = new Dog(name, age, gender);
			break;
		case "2":
			animal = new Cat(name, age, gender);
			break;
		case "3":
			animal = new Parrot(name, age, gender);
			break;
		default:
			System.out.println("Invalid input!");
		}
		
		// Add animal to the list
		if(isValidChoice) {
			listOfAnimals.add(animal);
			System.out.println(MenuConstant.ADDMENU_ISNOWADDED + "\n");
		}
		
		return listOfAnimals;
	}
}

package com.pointwest.training.service;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.ui.HomePageUI;

public class AnimalShelterService {
	protected static List<Animal> listOfAnimals = new ArrayList<Animal>();
	public static boolean isContinue = true;
	
	public void mainService() {		
		
		HomePageUI homePage = new HomePageUI();
		String choice = homePage.displayMainMenu(listOfAnimals.size());
		
		// Pick Add, Remove, View
		switch(choice) {
		case "1":
			listOfAnimals = AddAnimalService.addAnimal(listOfAnimals);
			break;
		case "2":
			listOfAnimals = RemoveAnimalService.removeAnimal(listOfAnimals);
			break;
		case "3":
			ViewAllAnimalsService.displayAllAnimals(listOfAnimals);
			break;
		case "0":
			AnimalShelterService.isContinue = false;
			System.out.println("Program Ended. Thanks!");
			break;
		}
	}
}

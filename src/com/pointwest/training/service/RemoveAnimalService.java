package com.pointwest.training.service;

import java.util.List;
import java.util.ListIterator;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.constants.MenuConstant;
import com.pointwest.training.ui.RemoveMenuUI;

public class RemoveAnimalService {
	protected static List<Animal> removeAnimal(List<Animal> listOfAnimals) {
		
		RemoveMenuUI removeMenu = new RemoveMenuUI();
		
		int refId = removeMenu.displayRemoveMenu();
		
		ListIterator<Animal> listIterator = listOfAnimals.listIterator();
		
		while(listIterator.hasNext()) {			
			Animal animal = listIterator.next();
			// IF FOUND 
			// REMOVE, PRINT SUCCESS, return the list 
			//NOTE: [this will end the method]
			if(refId == animal.getRefId()) {
				int indexNum = listOfAnimals.indexOf(animal);
				listOfAnimals.remove(indexNum);
				System.out.println(MenuConstant.REMOVEMENU_SUCCESS);
				return listOfAnimals;
			}
		}
		
		// Prints Remove Fail
		System.out.println(MenuConstant.REMOVEMENU_FAIL);
		
		return listOfAnimals;
	}
}

package com.pointwest.training.service;

import java.util.List;
import java.util.ListIterator;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.constants.MenuConstant;

public class ViewAllAnimalsService {
	// displays greetings of each animals on the list
	protected static void displayAllAnimals(List<Animal> listOfAnimals) {
		
		System.out.println(MenuConstant.VIEWMENU_HEADER);
		
		ListIterator<Animal> listIterator = listOfAnimals.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next().displayGreetings();
		}
	}
}

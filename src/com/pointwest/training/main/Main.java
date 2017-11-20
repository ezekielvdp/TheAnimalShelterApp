package com.pointwest.training.main;

import com.pointwest.training.service.AnimalShelterService;

public class Main {

	public static void main(String[] args) {
		
		AnimalShelterService AnimalShelter = new AnimalShelterService();
		
		do {
			AnimalShelter.mainService();
		} while (AnimalShelterService.isContinue);
	}

}

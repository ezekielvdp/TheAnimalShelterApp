package com.pointwest.training.ui;

import java.util.Scanner;

import com.pointwest.training.constants.MenuConstant;

public class HomePageUI {
	// Declare scan
	Scanner scan = new Scanner(System.in);

	public String displayMainMenu(int listSize) {
		String choice = null;

		boolean isValidChoice = false;
		
		if (listSize > 0 && !(listSize >= 10)) {
			// Display Normal Menu
			do {
				displayMenuNormal();
				choice = scan.next();
				isValidChoice = "1".equals(choice) ||
								"2".equals(choice) || 
								"3".equals(choice) || 
								"0".equals(choice);
				printIfIsNotValidChoice(isValidChoice);
			} while(!isValidChoice);
		} else if (listSize >= 10) {
			// Display Full
			displayDoYouWantToContinue();
			choice = scan.next();
			
			if ("1".equals(choice)) {
				do {
					displayMenuWhenFull();
					choice = scan.next();
					isValidChoice = "2".equals(choice) || 
									"3".equals(choice) || 
									"0".equals(choice);
					printIfIsNotValidChoice(isValidChoice);
				} while(!isValidChoice);
			} else if ("2".equals(choice)) {
				// This will end the program
				choice = "0";
			}
		} else {
			// Display empty & do while input is not valid
			do {
				displayMenuWhenZeroSize();
				choice = scan.next();
				isValidChoice = "1".equals(choice) || 
								"0".equals(choice);
				printIfIsNotValidChoice(isValidChoice);
			} while(!isValidChoice);
		}
		return choice;
	}
	
	public void printIfIsNotValidChoice(boolean isValidChoice) {
		if(!isValidChoice) {
			System.out.println("Invalid Choice, please pick again!");
		}
	}

	public void displayMenuNormal() {
		System.out.println(MenuConstant.MAINMENU_WELCOME);
		System.out.println(MenuConstant.MAINMENU_HEADER);
		System.out.println(MenuConstant.MAINMENU_ADD);
		System.out.println(MenuConstant.MAINMENU_REMOVE);
		System.out.println(MenuConstant.MAINMENU_VIEW);
		System.out.println(MenuConstant.MAINMENU_EXIT);
		System.out.println(MenuConstant.ENTERCHOICE_TXT);
	}

	public void displayMenuWhenZeroSize() {
		System.out.println(MenuConstant.MAINMENU_ZEROSIZE);
		System.out.println(MenuConstant.MAINMENU_ADD);
		System.out.println(MenuConstant.MAINMENU_EXIT);
		System.out.println(MenuConstant.ENTERCHOICE_TXT);
	}

	public void displayMenuWhenFull() {
		System.out.println(MenuConstant.MAINMENU_REMOVE);
		System.out.println(MenuConstant.MAINMENU_VIEW);
		System.out.println(MenuConstant.MAINMENU_EXIT);
		System.out.println(MenuConstant.ENTERCHOICE_TXT);
	}
	
	public void displayDoYouWantToContinue() {
		System.out.println(MenuConstant.MAINMENU_FULL1);
		System.out.println(MenuConstant.MAINMENU_FULL2);
		System.out.println(MenuConstant.MAINMENU_CONTINUE);
	}
}

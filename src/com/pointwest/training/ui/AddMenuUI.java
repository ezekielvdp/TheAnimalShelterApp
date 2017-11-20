package com.pointwest.training.ui;

import java.util.Scanner;

import com.pointwest.training.constants.MenuConstant;

public class AddMenuUI {
	// Declare scan
	Scanner scan = new Scanner(System.in);
		
	public String displayAddMenu() {
		String choice = null;
		
		System.out.println(MenuConstant.ADDMENU_HEADER);
		System.out.println(MenuConstant.ADDMENU_DOG);
		System.out.println(MenuConstant.ADDMENU_CAT);
		System.out.println(MenuConstant.ADDMENU_PARROT);
		System.out.println(MenuConstant.ENTERCHOICE_TXT);
		choice = scan.nextLine();
		
		return choice;
	} 
	
	public String setName() {
		System.out.println(MenuConstant.ENTERNAME_TXT);
		String name = scan.next();
		
		return name;
	}
	
	public int setAge() {
		System.out.println(MenuConstant.ENTERAGE_TXT);
		int age = scan.nextInt();
		
		return age;
	}
	
	public String setGender() {
		System.out.println(MenuConstant.ENTERGENDER_TXT);
		String gender = scan.next();
		
		return gender;
	}
}

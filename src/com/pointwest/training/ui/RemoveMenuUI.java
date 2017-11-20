package com.pointwest.training.ui;

import java.util.Scanner;

import com.pointwest.training.constants.MenuConstant;

public class RemoveMenuUI {
	// Declare scan
	Scanner scan = new Scanner(System.in);

	public int displayRemoveMenu() {
		System.out.println(MenuConstant.REMOVEMENU_REFID);
		int refId = scan.nextInt();

		return refId;
	}
}

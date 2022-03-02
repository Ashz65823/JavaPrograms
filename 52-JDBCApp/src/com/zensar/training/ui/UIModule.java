package com.zensar.training.ui;

import java.time.LocalDate;

import com.zensar.training.bean.Gender;

public class UIModule {
	private static void blankLines(int num) {
		for(int i=1;i<=num; i++)
			System.out.println();
	}
	public static void addInfo() {
		blankLines(3);
		InputPrompter prompter= new InputPrompter();
		
		String name= prompter.promptForStringInput("Enter Name");
		char grade=prompter.promptForCharInput("Enter Grade[A,B,C]");
		LocalDate hiredDate=prompter.promptForDateInput("Enter DOJ", "dd-MMM-yyyy");
		double salary=prompter.promptForDoubleInput("Enter Basic Salary");
		Gender gender=prompter.promptForGenderInput("Enter Gender [1.MALE 2.FEMALE]");
		
		// more code here
	}
	
	public static void updateInfo() {
		blankLines(3);
		InputPrompter prompter= new InputPrompter();
		
		int editableID=prompter.promptForIntInput("Enter ID to Update");
		String name= prompter.promptForStringInput("Enter Name");
		char grade=prompter.promptForCharInput("Enter Grade [A,B,C]");
		LocalDate hiredDate=prompter.promptForDateInput("Enter DOJ", "dd-MMM-yyyy");
		double salary=prompter.promptForDoubleInput("Enter Basic Salary");
		Gender gender=prompter.promptForGenderInput("Enter Gender [1.MALE 2.FEMALE]");
		
		// more code here
	}
	
	public static void searchInfo() {
		blankLines(3);
		InputPrompter prompter= new InputPrompter();
		int searchId=prompter.promptForIntInput("Enter ID to Search");
		
		
		// more code here
	}
	
	public static  void listInfo() {
		blankLines(3);
		
		// more code herer
	}
	
	public static void deleteInfo() {
		blankLines(3);
		InputPrompter prompter= new InputPrompter();
		int searchId=prompter.promptForIntInput("Enter ID to Delete");
		
		
		// more code here
	}
}

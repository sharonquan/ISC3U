package quan;

import java.util.Scanner;

/* 
 * Mother and Kid.java 
 * This program finds the age difference of a mother and their child 
 * Sharon Quan	
 * 2016 03 08
 */
public class MotherAndKid {
	public static void main(String[] args) {
	/* 
    * 	Main Method
	*/	
	Scanner userInput = new Scanner(System.in);
	//*** Asking for the Name of user and mother
	System.out.println("Please enter your mother's full name.");
	String motherName = userInput.nextLine();
	System.out.println("Please enter your full name.");
	String kidsName = userInput.nextLine();
	
	//*** Asking for the birth year of the mother and user
	System.out.println("Please enter your mother's birth year.");
	int motherYear = Integer.parseInt(userInput.nextLine()); // user's mother's age
	System.out.println("Please enter your birth year.");
	int kidsYear = Integer.parseInt(userInput.nextLine()); // user's age
	
	//*** Processing the birth years 
	int difference = kidsYear - motherYear; 
	
	//*** Output information 
	System.out.println(kidsName + ", your mother " + motherName + " was " + difference +" when you were born.");

	
	}
}
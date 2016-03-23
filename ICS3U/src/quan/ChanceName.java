package quan;

import java.util.Scanner;

/* 
 * ChanceName.java 
 * This program tells the user if they like their name or not
 * Sharon Quan	
 * 2016 03 23
 */
public class ChanceName {

	public static void main(String[] args) {
		// declaring variables and setting up the random generator 
		String userName; 
		int randomNum = (int)(Math.random() * 10) + 1;
		
		// asking for user's name
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name."); 
		userName = userInput.nextLine(); 
		
		// deciding if the computer likes the user's name or not and displaying the comment 
		if (randomNum <= 3)
		{
			System.out.println("I don't like the name " + userName + "..."); 

		}
		else 
		{
			System.out.println("Wow, " + userName + "? That's a nice name!");
		}
		

	}

}

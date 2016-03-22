package quan;

import java.util.Scanner;

/* SimpleOne.java
 * Taking a number from user to see if it's positive or negative and if it's divisible by 7 or not 
 * Sharon Quan
 * 2016 03 22
 */
public class SimpleOne {

	public static void main(String[] args) {
		//Declaring the variable  
		int userNum; 
		
		//Asking for user's input of a number 
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a number. ");
		userNum = Integer.parseInt(userInput.nextLine());
		
		// Going through the conditions to see if the input is negative, positive or 0 
		if (userNum < 0)
		{
			System.out.println("The number you've entered is less than 0");
		}
		else if (userNum > 0)
		{ 
			System.out.println("The number you've entered is greater than 0");
		}
		else 
		{
			System.out.println("The number you've entered is neither positive or negative, it's 0");
		}
		
		
		// Determining if the number entered is divisible by 7 
		if (userNum % 7 == 0 && userNum != 0)
		{
			System.out.println("The number you've entered also is divisible by 7");
		}
		else
		{
			System.out.println("The number you've entered is not divisible by 7");
		}
	}

}

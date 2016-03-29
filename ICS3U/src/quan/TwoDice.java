package quan;

import java.util.Scanner;

/* TwoDice.java
 * Two dice being rolled with options to play again. User vs Computer
 * Sharon Quan
 * 2016 03 29
 */
public class TwoDice {

	public static void main(String[] args) {
		//declaring variable for the loop
		boolean reroll = true; 
		//loop begins
		while (reroll == true)
		{	

			// declaring variables for user and creating the random generator for the dies
			int dieOne = (int)(Math.random() * 6) + 1; 
			int dieTwo = (int)(Math.random() * 6) + 1; 
			int user = dieOne + dieTwo;
			String answer; 
			
			//Taking input from the user
			Scanner userInput = new Scanner(System.in);
			
			
			// outputting computer's results 
			System.out.println("You rolled a: " + user);

			// declaring variables and regenerating the random generator for the computer  
			dieOne = (int)(Math.random() * 6) + 1; 
			dieTwo = (int)(Math.random() * 6) + 1; 
			int computer = dieOne + dieTwo; 

			// outputting computer's results 
			System.out.println("I rolled a: " + computer);

			// outputting the winner 

			if (user > computer)
			{
				System.out.println("You won!");
			}
			else if (user < computer)
			{
				System.out.println("I won!");
			}
			else 
			{
				System.out.println("We tied");
			}
			
			//asking user if they want to play again
			System.out.println("Do you wanna play again? Please enter Y for yes and N for no.");
			answer = userInput.nextLine(); 
			
			//seeing if the user wants to play again; if they do, the loop goes on.
			if (answer.equalsIgnoreCase("Y"))
			{
				reroll = true;
			}
			else
			{
				reroll = false;
				System.out.println("Goodbye");
			}
			

		}
	}

}

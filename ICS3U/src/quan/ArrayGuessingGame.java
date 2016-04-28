package quan;
/*
 * Sharon Quan
 * 27/04/2016
 * ArrayGuessingGame.java
 * This program makes the user a randomly generated colour
 */
import java.util.Scanner;

public class ArrayGuessingGame {

	public static void main(String[] args)
	{
		String [] colour = {"red", "blue", "pink","purple", "black", "white", "orange", "brown", "green", "teal","gold", "yellow", "gray", "tan", "indigo", "aqua", "violet", "olive green", "salmon", "navy", "mint green", "coral", "beige", "silver"}; //create array
		String answer; 
		int guess = 0; 

		
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, let's play a guessing game. Think of an colour, but don't tell me.");
		
		do
		{
			guess++;
			int rndmNumIndex = (int)(Math.random()*23); //index in the array
			System.out.println("Is it " + colour[rndmNumIndex] + "? (Y/N)");
			answer = input.nextLine(); 
			
			if (guess <= 23 && answer.equalsIgnoreCase("y"))
			{
				System.out.println("Yay! I won in " + guess + "."); 
			}
			else if (!answer.equalsIgnoreCase("n"))
			{
				System.out.println("I don't know anymore..");
			}

		}while(answer.equalsIgnoreCase("n"));
			
		
		
		
		
	}

}

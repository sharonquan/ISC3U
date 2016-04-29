package quan;
/*
 * Sharon Quan
 * 27/04/2016
 * ArrayGuessingGame.java
 * This program randomly generates colours that the user might have guessed and asks if they guessed correctly 
 */
import java.util.Scanner;

public class ArrayGuessingGame {

	public static void main(String[] args)
	{
		String [] colour = {"red", "blue", "pink","purple", "fushia", "black", "white", "orange", "brown", "green", "teal","gold", "yellow", "gray", "tan", "indigo", "aqua", "violet", "olive green", "salmon", "navy", "mint green", "coral", "beige", "silver"}; //create array
		String answer = "n"; //user's input
		boolean [] colours = new boolean[colour.length]; 
		int guess = 0; //counter
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, let's play a guessing game. Think of an colour, but don't tell me.");
		
			do //keep on repeating when the user says no 
			{
				int rndmNumIndex = (int)(Math.random()* colour.length); //index in the array
			
				if(!colours[rndmNumIndex])
				{
					colours[rndmNumIndex] = true;
					System.out.println("Is it " + colour[rndmNumIndex] + "? (Y/N)");
					answer = input.nextLine(); 
					guess++; //adding the number of times the computer was guessing (counter)
				
					if(answer.equalsIgnoreCase("y")) //if the user says yes
					{
						System.out.println("Yay! I win, I was able to get it in " + guess + " tries."); 
					}
					if (guess==colour.length) //sees if the counter is equal to the length of the array
					{
						System.out.println("I give up, you win.");

					}
				}
			
			}while(answer.equalsIgnoreCase("n"));
		
		
	}

}

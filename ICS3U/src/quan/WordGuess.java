package quan;
/*
 * Sharon Quan 
 * 10/05/2016
 * WordGuess 
 * This program makes the user guess a colour 
 */
import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		
		//declaring variables 
		String [] secretColour = {"red", "blue", "pink","brown"}; //create array
		String guessWL;  //user's guessed  word or letter. WL stands for word or letter
		int random = (int)(Math.random() * secretColour.length); //randomly generating words

		//creating scanner
		Scanner input = new Scanner(System.in);
		String dashes = ""; 
		System.out.println("Welcome to WordGuess game.");
		
		//creating dashes for the number of letters for the colour from the array 
		for (int i  = 0; i < secretColour[random].length(); i++) //used like a counter
		{
			dashes = dashes + "-"; 
			
		}
		
		System.out.println(dashes); 
		
		do //the code inside this loop will repeat until the user guesses all the right letters 
		{
			int counter = 0; //declare counter 

			System.out.println("Please enter a letter of a colour or the word of a colour (Enter ! if you're going to guess a word)");
			guessWL = input.nextLine(); 
			
			if (guessWL.equalsIgnoreCase("!"))
			{
				System.out.println("What colour do you think it is?");
				guessWL = input.nextLine();
				
				if (guessWL.equalsIgnoreCase(secretColour[random])) //seeing if the input matches the word
				{
					System.out.println("Wow! You got it right!");
				}
				else
				{
					System.out.println("Sorry! That's incorrect..");
				}
				
			}
			else 
			{
				int number = secretColour[random].indexOf(guessWL);
				
				if(number == -1) //checking if the number is part of the word or not 
				{
					System.out.println("Oh no, that letter is not part of the word");
				}
				else 
				{
					dashes = dashes.substring(0,number) + guessWL + dashes.substring(number+1,secretColour[random].length());
					System.out.println(dashes);

				}
				
				for(int i = 0; i< dashes.length(); i ++) //allows the users to keep on trying
				{
					if(dashes.charAt(i) != '-')
					{
						counter++; 
					}
					if (counter == secretColour[random].length())
					{
						System.out.println("Yay! You guessed all the correct letters!!");
						guessWL = secretColour[random];
					}
					
				}
				
			}
						
		}
		while(!guessWL.equalsIgnoreCase(secretColour[random])); 
		
		

	}

}

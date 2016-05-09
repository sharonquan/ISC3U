package quan;

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		
		String [] secretColour = {"red", "blue", "pink","purple"}; //create array
		String guessWL;  
		String dashes = ""; 
		int random = (int)(Math.random() * secretColour.length); 
		
		//guessWL = guessWL.substring(0,2) + input + guessWL.substring(3,5); 
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("WordGuess game.");
		
		for (int i  = 0; i < secretColour[random].length(); i++)
		{
			dashes = dashes + "-"; 
			
		}
		System.out.println(dashes); 
		do 
		{
			System.out.println("Please enter a letter of a colour or the word of a colour");
			guessWL = input.nextLine(); 
			
			if (guessWL == "!")
			{
				
			}
			else 
			{
				
			}
			
			
		}while
		
		

	}

}

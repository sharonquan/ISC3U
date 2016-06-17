package quan;
/*
 * Sharon Quan 
 * 30/05/2016
 * PrimeNumber.java
 * This program allows the user to input a number and determine if it's prime or not 
 */
import java.util.Scanner;

public class PrimeNumber {
	//global variable
	public static int num;
	/**
	 * This is the main method (the entry point to the program)
	 * This gets the numbers from the user and puts it through the methods
	 * @param args - unused
	 */
	public static void main(String[] args) 
	{
		//user input
		Scanner scn = new Scanner(System.in);

		//input prompts
		System.out.println("Please enter a number.");
		num = scn.nextInt();
			
		//Checking to see if it's prime or not
			if (isPrime(num))
			{
				System.out.println(num +" is prime.");
			}
			else
			{
				System.out.println(num +" is not prime.");
			}

	}
	/**
	 * This method checks if the number is divisible by the counter. When the boolean is true then it's prime, when it's false the value is not prime
	 * @param num - int 
	 * @param i - int
	 * 
	 */
	public static boolean isDivisible(int num, int i) 
	{
		
		if(num % i != 0) //when the number gets divided by i and the remainder is 0 
		{
			return (false); 
		}
		//if it isn't then return true 
		return(true);
	
	}
	/**
	 * This method checks if the number inputed is a prime number. When the boolean is true then it's prime, when it's false the value is not prime
	 * @param num - int 
	 */
	public static boolean isPrime(int num)
	{
		// when the number is 0 or 1, it doesn't need to do the loop
		if(num == 0||num == 1)
		{
			return(false);
		}
		//loop to see if the number is prime or not
		for(int i = 2 ; i < num ; i++)
		{
			if(isDivisible(num, i) == true)
			{
				return (false);
			}
		}
		return(true);
	}

}
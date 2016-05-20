package quan;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Program asks for two numbers from the user and performs an operation 
 * @author Sharon Quan
 * @version 20/05/2016
 *
 */
public class FunWithMath 
{
	public static DecimalFormat decimal = new DecimalFormat("0.00"); // for the rounding of the answers  
	
	/**
	 * This is the main method (the entry point to the program)
	 * This gets the numbers from the user and puts it through the methods
	 * @param args - unused
	 */
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 numbers!");

		double number1 = input.nextDouble(); 
		double number2 = input.nextDouble(); 
		
		times(number1,number2);
		divide(number1,number2);
		add(number1,number2);
		subtract(number1,number2);

	}
	
	/**
	 * This method multiplies the two numbers 
	 * @param number1 - double 
	 * @param number2 - double
	 */
	public static void times (double number1, double number2)
	{
		System.out.println(number1 + " * " + number2 + " = " + (decimal.format(number1*number2)));
		System.out.println("");

	}
	
	/**
	 * This method divides the two numbers 
	 * @param number1 - double
	 * @param number2 - double
	 */
	public static void divide (double number1, double number2)
	{
		System.out.println(number1 + " / " + number2 + " = " + (decimal.format(number1/number2)));
		System.out.println("");

	}
	
	/**
	 * This method adds the two numbers 
	 * @param number1 - double 
	 * @param number2 - double
	 */
	public static void add (double number1, double number2)
	{
		System.out.println(number1 + " + " + number2 + " = " + (decimal.format(number1+number2)));
		System.out.println("");
	}
	
	/**
	 * This method subtracts the two numbers 
	 * @param number1 - double 
	 * @param number2 - double
	 */
	public static void subtract (double number1, double number2)
	{
		System.out.println(number1 + " - " + number2 + " = " + (decimal.format(number1-number2)));
		
	}

}

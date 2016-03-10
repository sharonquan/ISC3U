package quan;

import java.util.Scanner;
/* ArthmericExpression.java
 * Taking 5 numbers from the user and puts them through multiple operations and then displays to the user 
 * Sharon Quan
 * 2016 03 10
 */
public class ArthmeticExpression {

	public static void main(String[] args) {
		/*
		 * Main Method 
		 */
		
		//declaring variables for numbers inputed 
		int numOne;
		int numTwo;
		int numThree;
		int numFour; 
		int numFive;
		//declaring answer variable for the equations
		int numSum;
		int numSub;
		int numTimes;
		double numDivide;
		int numRemain;
		int numPower; 
		double numRoot; 
		
		
		Scanner userInput = new Scanner(System.in);
		
		// taking numbers from the user assigning variable)
		System.out.println("Please enter the first number.");
		numOne = Integer.parseInt(userInput.nextLine());
		System.out.println("Please enter second number.");
		numTwo = Integer.parseInt(userInput.nextLine());
		System.out.println("Please enter third number.");
		numThree = Integer.parseInt(userInput.nextLine());
		System.out.println("Please enter fourth number.");
		numFour = Integer.parseInt(userInput.nextLine());
		System.out.println("Please enter fifth number.");
		numFive = Integer.parseInt(userInput.nextLine());
		
		//displaying the answers to the user  
		numSum = numOne + numTwo + numThree + numFour + numFive;
		System.out.println("The sum of all five numbers: " + numSum);
		
		numSub = numThree - numTwo; 
		System.out.println("The result after subtracting the second number from the third number: " + numSub);
		
		numTimes = numOne * numFive; 
		System.out.println("The product of the first and fifth number: " + numTimes); 
		
		numDivide = (double)numFour / numTwo; 
		System.out.println("The quotient of the fourth number divided by the second number: " + numDivide); 
		
		numRemain = numFour % numTwo;
		System.out.println("The remainder when dividing the fourth number by the second number: " + numRemain);
		
		numPower = (int)Math.pow(numOne,numThree); 
		System.out.println("The first number raised to the power of the third number: " + numPower);
		
		numRoot = Math.sqrt(numFive);
		System.out.println("The square root of the fifth number: " + numRoot);
		
	}

}

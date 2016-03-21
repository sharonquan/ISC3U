package quan;

import java.text.DecimalFormat;
import java.util.Scanner;
/* QuadraticEquation.java
 * Taking 5 numbers from the user and puts them through multiple operations and then displays to the user 
 * Sharon Quan
 * 2016 03 10
 */
public class QuadraticEquation {

	public static void main(String[] args) {
		//declaring variables 
		double a; 
		double b;
		double c; 
		double answerOne;
		double answerTwo; 
		double discrim;
		
		// Asking for the user's input 
		Scanner userInput = new Scanner(System.in);
		DecimalFormat round = new DecimalFormat ("0.0"); 
		
		System.out.println("Find the x values with a quadratic equation");
		
		System.out.println("Please enter the value of A. The A value must not be 0.");
		a = Double.parseDouble(userInput.nextLine());

		
		System.out.println("Please enter the value of B.");
		b = Double.parseDouble(userInput.nextLine());
		
		System.out.println("Please enter the value of C.");
		c = Double.parseDouble(userInput.nextLine());
			
		// Find the roots and Output of the answers 
		discrim = ((Math.pow(b, 2) - 4 * a * c ));
		if (discrim == 0)
		{
			answerOne = (-b + (Math.sqrt(discrim)) / (2 * a));
			System.out.println("Root(s): " + round.format(answerOne));
		}
		else if (discrim < 0)
		{ 
			System.out.println("There are no real roots.");
		}
		else if (discrim > 0)
		{
			answerOne = (-b + (Math.sqrt(discrim)) / (2 * a));
			answerTwo = (-b - (Math.sqrt(discrim)) / (2 * a));
			System.out.println("Root(s): " + round.format(answerOne) + " and " + round.format(answerTwo));
		}
		
		
	}
}

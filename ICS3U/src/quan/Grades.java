package quan;

import java.util.Scanner;
/* Grades.java
 * Let the user in up a number and display a corresponding grade in letters
 * Sharon Quan
 * 2016 03 31
 */
public class Grades {

	public static void main(String[] args) {
		
		//declaring variables 
		int terms = 0;
		int nextNum;
		int marks;
		
		// input of number of terms and marks
		System.out.println("Please input the number of marks you have.");

		Scanner userInput = new Scanner(System.in);
		terms = userInput.nextInt(); 
		
		System.out.println("Please input the marks.");

		// displaying the marks in letters for every mark (in numbers) that were inputed 
		for (marks = 0; marks <= terms; marks++)
		{
			nextNum = userInput.nextInt(); 

			if (nextNum >= 80 && nextNum <= 100)
			{
				System.out.println("You're mark is an A.");
			}
			else if (nextNum >= 70 && nextNum <= 79)
			{
				System.out.println("You're mark is a B.");
			}
			else if (nextNum >= 60 && nextNum <= 69)
			{
				System.out.println("You're mark is a C.");
			}
			else if (nextNum >= 50 && nextNum <= 59)
			{
				System.out.println("You're mark is a D.");
			}
			else
			{
				System.out.println("You're mark is a X.");
			}
		}
	}

}

package quan;
/* TwoDice.java
 * Two dice being rolled. User vs Computer
 * Sharon Quan
 * 2016 03 23
 */
public class TwoDice {

	public static void main(String[] args) {
		
		// declaring variables and creating the random generator for the user 
		int dieOne = (int)(Math.random() * 6) + 1; 
		int dieTwo = (int)(Math.random() * 6) + 1; 
		int user = dieOne + dieTwo;
		
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
		

	}

}

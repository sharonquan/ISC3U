package quan;
/*
 * Sharon Quan
 * 26/04/2016
 * ArrayOne 
 * This program prints the names forward and then backwards 
 */
import java.util.Scanner;

public class ArrayOne {

	public static void main(String[] args) {
		//user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of names");
		int numNames = input.nextInt();  
		input.nextLine();
		
		String [] names = new String[numNames]; //array
		
		System.out.println("Please enter the names");

		for (int i = 0; i < numNames; i++) //loop for names
		{
			names[i] = input.nextLine(); 
		}
		for (int i = 0; i < numNames; i++) //printing names forwards
		{
			System.out.println(names[i]);
		}
				
		for (int i = numNames -1; i >= 0 ; i --) //printing names backwards 
		{
			System.out.println(names[i]);
		}
		
		
		
	
		

	}

}

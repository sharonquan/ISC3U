package quan;

import java.util.Scanner;

/*
 * Sharon Quan
 * 11/05/2016
 * TicTackToe.java
 * This program allows two user to play tick tack toe together on the same computer 
 */
public class TicTackToe {

	public static void main(String[] args) {
		// declaring variables and making a two dimensional array
		String[][] board = new String[3][3];

		// boolean for knowing if the coordinates have been used
		boolean[][] used = new boolean[3][3];
		boolean x = false;
		boolean o = false;
		// setting coordinates for the board
		board[0][0] = "";
		board[0][1] = "";
		board[0][2] = "";
		board[1][0] = "";
		board[1][1] = "";
		board[1][2] = "";
		board[2][0] = "";
		board[2][1] = "";
		board[2][2] = "";

		boolean win = false; // start with making win false
		int row;
		int column;
		
		//determining if the users want to play again
		boolean again = true;
		String answer; 

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to a game of Tick Tack Toe. Enter the coodinate according to run over rise, please do not enter coodinates that have allready been inputted.");
		//loop for playing again 
		
		while (again) 
		{
			while (!win) 
			{
				// the X player's turn
				if (!o)
				{
				// asking X player for coordinates
				System.out.println("What are the coordinates you would like to place the X? (Example: 3, 1)");

				row = input.nextInt();
				column = input.nextInt();

				// making sure that the coordinates aren't used twice
				if (!used[row - 1 ][column - 1]) 
				{
					used[row - 1][column - 1] = true;

					// Putting the x into the array
					board[row - 1][column - 1] = " X ";

					// the tick tack toe "board"
					System.out.println(board[0][0] + "\t" + board[0][1] + "\t" + board[0][2]);
					System.out.println(board[1][0] + "\t" + board[1][1] + "\t" + board[1][2]);
					System.out.println(board[2][0] + "\t" + board[2][1] + "\t" + board[2][2]);

					// Checking for the winner
					if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && !board[0][2].equals("")) 
					{
						System.out.println(board[0][0] + " wins!"); 
						win = true;
					} 
					else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && !board[1][2].equals("")) 
					{
						System.out.println(board[1][0] + " wins!");
						win = true;
					} 
					else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
					{
						System.out.println(board[2][0] + " wins!");
						win = true;
					} 
					else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && !board[2][1].equals("")) 
					{
						System.out.println(board[0][1] + " wins!"); //CHANGED
						win = true;
					} 
					else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && !board[0][2].equals("")) 
					{
						System.out.println(board[0][0] + " wins!"); //CHECK
						win = true;
					} 
					else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && !board[2][2].equals("")) 
					{
						System.out.println(board[0][2] + " wins!"); //CHECK
						win = true;
					} 
					else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && !board[2][2].equals("")) 
					{
						System.out.println(board[2][2] + " wins!");
						win = true;
					} 
					else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && !board[0][2].equals("")) 
					{
						System.out.println(board[0][0] + " wins!");
						win = true;
					} 
					else 
					{
						win = false;
					}
					// seeing if it's a cat's game
					if (!board[0][0].equals("") && !board[0][1].equals("") && !board[0][2].equals("")
							&& !board[1][0].equals("") && !board[1][1].equals("") && !board[1][2].equals("")
							&& !board[2][0].equals("") && !board[2][1].equals("") && !board[2][2].equals("") && !win) 
					{
						win = true;
						System.out.println("Oh no! It's a cat's game!");
					}
					x = false;

				} else 
				{
					System.out.println("Sorry, those coordinates have already been used.");
					x = true;
				}
				}
				// the O player's turn
				if (!win && !x) 
				{
					// asking O player for coordinates
					System.out.println("What are the coordinates you would like to place the O? (Example: 3 1)");

					row = input.nextInt();
					column = input.nextInt();

					if (!used[row-1][column-1]) 
					{
						used[row-1][column-1] = true;

						// Putting the O into the array
						board[row - 1][column - 1] = " O ";

						System.out.println(board[0][0] + "\t" + board[0][1] + "\t" + board[0][2]);
						System.out.println(board[1][0] + "\t" + board[1][1] + "\t" + board[1][2]);
						System.out.println(board[2][0] + "\t" + board[2][1] + "\t" + board[2][2]);

						// Checking for the winner again
						if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && !board[0][2].equals("")) 
						{
							System.out.println(board[0][0] + " wins!"); 
							win = true;
						} 
						else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && !board[1][2].equals("")) 
						{
							System.out.println(board[1][0] + " wins!");
							win = true;
						} 
						else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
						{
							System.out.println(board[2][0] + " wins!");
							win = true;
						} 
						else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && !board[2][1].equals("")) 
						{
							System.out.println(board[0][1] + " wins!"); //CHANGED
							win = true;
						} 
						else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && !board[0][2].equals("")) 
						{
							System.out.println(board[0][0] + " wins!"); //CHECK
							win = true;
						} 
						else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && !board[2][2].equals("")) 
						{
							System.out.println(board[0][2] + " wins!"); //CHECK 
							win = true;
						} 
						else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && !board[2][2].equals("")) 
						{
							System.out.println(board[2][2] + " wins!");
							win = true;
						} 
						else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && !board[0][2].equals("")) 
						{
							System.out.println(board[0][0] + " wins!");
							win = true;
						} 
						else 
						{
							win = false;
						}
						// seeing if it's a cat's game

						if (!board[0][0].equals("") && !board[0][1].equals("") && !board[0][2].equals("")
								&& !board[1][0].equals("") && !board[1][1].equals("") && !board[1][2].equals("")
								&& !board[2][0].equals("") && !board[2][1].equals("") && !board[2][2].equals("") && !win) 
						{
							win = true;
							System.out.println("Oh no! It's a cat's game!");
						}
						o = false;
					} 
					else 
					{
						System.out.println("Sorry, those coordinates have already been used.");
						o = true;
					}
				}

			}
			
			System.out.println("Play again? (Please enter Y or N)");
			
			input.nextLine(); 
			answer = input.nextLine(); 
			// seeing if the player wants to play again 
			if(answer.equalsIgnoreCase("n"))
			{
				System.out.println("Oh, okay. Bye!"); 
				again = false; 
			}
			//resetting the board and coordinates 
			else 
			{	
				board[0][0] = "";
				board[0][1] = "";
				board[0][2] = "";
				board[1][0] = "";
				board[1][1] = "";
				board[1][2] = "";
				board[2][0] = "";
				board[2][1] = "";
				board[2][2] = "";
				
				used[0][0] = false;
				used[0][1] = false;
				used[0][2] = false;
				used[1][0] = false;
				used[1][1] = false;
				used[1][2] = false;
				used[2][0] = false;
				used[2][1] = false;
				used[2][2] = false;
				
				win = false; 
				again = true; 
				x = false; 
				o = false; 
				
			}

		}
	}

}
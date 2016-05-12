package quan;

import java.util.Scanner;
/*
 * Sharon Quan
 * 11/05/2016
 * TicTackToe.java
 * This program allows two user to play tick tack toe together on the same computer 
 */
public class TicTackToe {

	public static void main(String[] args) 
	{
		// declaring variables and making a two dimensional array
		String[][] board = new String[3][3];
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

		boolean win = false; // start with making
		int row;
		int column;

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Welcome to a game of Tick Tack Toe. Enter the coodinate according to run over rise, please do not enter coodinates that have allready been inputted.");
		while (win == false) 
		{
			// the X player's turn

			// asking X player for coordinates
			System.out.println("What are the coordinates you would like to place the X? (Example: 3, 1)");

			row = input.nextInt();
			column = input.nextInt();

			// Putting the x into the array
			board[row - 1][column - 1] = " X ";

			// the tick tack toe "board"
			System.out.println(board[0][0] + "\t" + board[0][1] + "\t" + board[0][2]);
			System.out.println(board[1][0] + "\t" + board[1][1] + "\t" + board[1][2]);
			System.out.println(board[2][0] + "\t" + board[2][1] + "\t" + board[2][2]);

			// Checking for the winner
			if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && !board[0][2].equals("")) 
			{
				System.out.println(board[0][0] + " wins!"); // this line
															// displays the
															// player that won
															// by taking the X
															// or 0 from the
															// board
				win = true;
			} else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && !board[1][2].equals("")) 
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			} else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
			{
				System.out.println(board[2][0] + " wins!");
				win = true;
			} else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && !board[1][0].equals("")) 
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			} else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && !board[1][2].equals("")) 
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			} else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
			{
				System.out.println(board[2][0] + " wins!");
				win = true;
			} else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && !board[2][2].equals("")) 
			{
				System.out.println(board[2][2] + " wins!");
				win = true;
			} else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && !board[0][2].equals("")) 
			{
				System.out.println(board[0][0] + " wins!");
				win = true;
			} else 
			{
				win = false;
			}
			// seeing if it's a cat's game
			if (!board[0][0].equals("") && board[0][1].equals("") && board[0][2].equals("") && board[1][0].equals("")
					&& board[1][1].equals("") && board[1][2].equals("") && board[2][0].equals("")
					&& board[2][1].equals("") && board[2][2].equals("")) 
			{
				win = true;
				System.out.println("Oh no! It's a cat's game!");
			}
			// the O player's turn
			if (!win) 
			{
				// asking O player for coordinates
				System.out.println("What are the coordinates you would like to place the O? (Example: 3 1)");

				row = input.nextInt();
				column = input.nextInt();

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
				} else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && !board[1][2].equals("")) 
				{
					System.out.println(board[1][0] + " wins!");
					win = true;
				} else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
				{
					System.out.println(board[2][0] + " wins!");
					win = true;
				} else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && !board[1][0].equals("")) 
				{
					System.out.println(board[1][0] + " wins!");
					win = true;
				} else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && !board[1][2].equals("")) 
				{
					System.out.println(board[1][0] + " wins!");
					win = true;
				} else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && !board[2][2].equals("")) 
				{
					System.out.println(board[2][0] + " wins!");
					win = true;
				} else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && !board[2][2].equals("")) 
				{
					System.out.println(board[2][2] + " wins!");
					win = true;
				} else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && !board[0][2].equals("")) 
				{
					System.out.println(board[0][0] + " wins!");
					win = true;
				} else {
					win = false;
				}
				// seeing if it's a cat's game

				if (!board[0][0].equals("") && board[0][1].equals("") && board[0][2].equals("")
						&& board[1][0].equals("") && board[1][1].equals("") && board[1][2].equals("")
						&& board[2][0].equals("") && board[2][1].equals("") && board[2][2].equals("")) 
				{
					win = true;
					System.out.println("Oh no! It's a cat's game!");
				}
			}

		}

	}

}
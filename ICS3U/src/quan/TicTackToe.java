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
		//declaring variables and making a two dimensional array 
		String [][] board=new String [3][3];
		board[0][0]="";
		board[0][1]="";
		board[0][2]="";
		board[1][0]="";
		board[1][1]="";
		board[1][2]="";
		board[2][0]="";
		board[2][1]="";
		board[2][2]="";
		
		boolean win=false;
		int row;
		int column;
		
		Scanner input = new Scanner(System.in);
		
		while (win==false)
		{
			// the X player's turn
			System.out.println("What are the coordinates you would like to place the X? (Example: 3, 1)"); 
		
			row = input.nextInt();
			column=input.nextInt();
		
			//Putting the x into the array
			board[row-1][column-1]="X";
			
			//the tick tack toe "board" 
			System.out.println(board[0][0]+"     " + board[0][1]+ "     " +board[0][2]);
			System.out.println(board[1][0]+"     " + board[1][1]+ "     " +board[1][2]);
			System.out.println(board[2][0]+"     " + board[2][1]+ "     " +board[2][2]);
		
			//Checking for the winner 
			if(board[0][0]==board[0][1]&&board[0][0]==board[0][2]&&!board[0][2].equals(""))
			{
				System.out.println(board[0][0] + " wins!");
				win = true;
			}
			else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&!board[1][2].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][0] + " wins!");
				win = true;
			}
			else if(board[0][0]==board[1][0]&&board[0][0]==board[2][0]&&!board[1][0].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[1][0]==board[1][1]&&board[1][0]==board[1][2]&&!board[1][2].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][0] +" wins!");
				win = true;
			}
			else if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][2] + " wins!");
				win = true;
			}
			else if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&!board[0][2].equals(""))
			{
				System.out.println(board[0][0] + " wins!");
				win = true;
			}
			else
			{
				win = false;
			}
	
			// the O player's turn 
			System.out.println("What are the coordinates you would like to place the O? (Example: 3 1)");
		
			row = input.nextInt();
			column = input.nextInt();
		
			//Putting the O into the array 
			board[row-1][column-1]="O";
		
			System.out.println(board[0][0] + "     " + board[0][1] + "     " + board[0][2]);
			System.out.println(board[1][0] + "     " + board[1][1] + "     " + board[1][2]);
			System.out.println(board[2][0] + "     " + board[2][1] + "     " + board[2][2]);
			
			//Checking for the winner again
			if(board[0][0] == board[0][1] && board[0][0] == board[0][2] &&! board[0][2].equals(""))
			{
				System.out.println(board[0][0] + " wins!");
				win = true;
			}
			else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&!board[1][2].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][0] + " wins!");
				win = true;
			}
			else if(board[0][0]==board[1][0]&&board[0][0]==board[2][0]&&!board[1][0].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[1][0]==board[1][1]&&board[1][0]==board[1][2]&&!board[1][2].equals(""))
			{
				System.out.println(board[1][0] + " wins!");
				win = true;
			}
			else if(board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][0] + " wins!");
				win = true;
			}
			else if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&!board[2][2].equals(""))
			{
				System.out.println(board[2][2] + " wins!");
				win = true;
			}
			else if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&!board[0][2].equals(""))
			{
				System.out.println(board[0][0] + " wins!");
				win = true;
			}
			else
			{
				win = false;
			}
		}

	}

}
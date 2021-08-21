package com.TicTacToe;

import java.util.Scanner;

/*
 *  Program to create a TicTacToe game 
 * @author Ashwith
 */

public class TicTacToeGame {
	// variables
	static char playerOption, computerOption;
	// array to store values of player and computer
	static char board[] = new char[10];
	static Scanner sc = new Scanner(System.in);

	/*
	 * This is a function that is used to create a board for the gameplay. We are
	 * initializing the board with empty spaces and starting from index "1".
	 * 
	 * @return This returns a board array
	 */
	public static char[] createboard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

	/*
	 * This is a method which allows the player to select either "X" or "O" as
	 * his/her option in the gameplay.
	 */
	public static void chooseOption() {
		System.out.println("Which option do you want to choose.");
		System.out.println("'X' or 'O'");
		char s = sc.next().charAt(0);
		if (s == 'X') {
			playerOption = 'X';
			computerOption = 'O';
		} else if (s == 'O') {
			playerOption = 'O';
			computerOption = 'X';
		} else {
			System.out.println("Invalid option");
		}
		System.out.println("OK.You have selected " + s);
	}

	/*
	 * This method displays the Game Board so that he/she can choose the valid cells
	 * to make their move during their turn.
	 */
	public static void showBoard() {
		System.out.println("Tic Tac Toe Board");
		System.out.println("  " + board[1] + " | " + board[2] + " | " + board[3] + "  ");
		System.out.println("  ---------  ");
		System.out.println("  " + board[4] + " | " + board[5] + " | " + board[6] + "  ");
		System.out.println("  ---------  ");
		System.out.println("  " + board[7] + " | " + board[8] + " | " + board[9] + "  ");
	}
	/*
	 * This method is to create for user to make a move to a desired location
	 * in the board.
	 * Input will take input from user like from 1 to 9. If it is not in
	 * range from 1 to 9. Then it will show you an error "Invalid input."
	 */
	public static void desiredLocation() {
		boolean validinput=false;
		do {
		System.out.println("Enter the position you want to place the element");
		int i = sc.nextInt();
		if (i>0 && i<10 ) {
			board[i] = playerOption;
			validinput=true;
			
		} else {
			System.out.println("Invalid Move");
		}
		showBoard();
		
		}while(!validinput);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Tic-Tac-Toe game");
		createboard();
		chooseOption();
		showBoard();
		desiredLocation();
	}

}

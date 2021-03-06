package com.TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Program to create a TicTacToe game 
 * @author Ashwith
 */

public class TicTacToeGame {
	// variables
	static char playerOption, computerOption;
	static int flag;
	static boolean b = true;
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
	 * This method is to create for user to make a move to a desired location in the
	 * board if there is a free space in that location. Input will take input from
	 * user like from 1 to 9. If it is not in range from 1 to 9. Then it will show
	 * you an error "Invalid move."
	 */
	public static void makeMovePlayer() {
		boolean validinput = false;
		do {
			System.out.println("Enter the position you want to place the element");
			int i = sc.nextInt();
			if (i > 0 && i < 10 && board[i] == ' ') {
				board[i] = playerOption;
				validinput = true;

			} else {
				System.out.println("Invalid Move");
			}
			showBoard();
		} while (!validinput);
	}

	public static void makeMoveComp() {
		boolean c = false;
		do {
			int i = (int) Math.floor(Math.random() * 10);
			if (board[i] == ' ' && board[i] != 'X' && board[i] != 'O') {
				board[i] = computerOption;
				c = true;
			}
		} while (!c);
		showBoard();
	}

	/*
	 * This method is to flip a coin who plays first select either 0 for Tail or 1
	 * for Head
	 * 
	 * @param None
	 */
	private static void toss() {
		System.out.println("Select 0 for Tail or 1 for Head to see who plays first");
		int playerSelection = sc.nextInt(); // player selecting the option either 0 or 1
		int toss = (int) Math.floor(Math.random() * 10) % 2;
		if (playerSelection == toss) {
			System.out.println("Player Won the Toss and Plays First");
			flag = 0;
		} else {
			System.out.println("Computer Won the Toss and Plays First");
			flag = 1;
		}
	}

	/*
	 * This method actually initiates the gameplay.If the player wins the toss he
	 * plays first else computer plays first.
	 */
	public static void startGame() {
		if (flag == 0) {
			while (b) {
				makeMovePlayer();
				checkWinnerPlayer();
				makeMoveComp();
				checkWinnerComputer();
			}
		} else {
			while (b) {
				makeMoveComp();
				checkWinnerComputer();
				makeMovePlayer();
				checkWinnerPlayer();
			}
		}
	}

	/*
	 * This method is used to check if the player wins the game.
	 * 
	 * @return This method returns a boolean data type
	 */
	public static boolean checkWinnerPlayer() {

		if (board[1] == playerOption && board[2] == playerOption && board[3] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		if (board[1] == playerOption && board[5] == playerOption && board[9] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		if (board[1] == playerOption && board[4] == playerOption && board[7] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		if (board[2] == playerOption && board[5] == playerOption && board[8] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		if (board[3] == playerOption && board[6] == playerOption && board[9] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		if (board[4] == playerOption && board[5] == playerOption && board[6] == playerOption) {
			System.out.println("You won");
			b = false;
		}
		return b;
	}

	/*
	 * This method is used to check if the computer wins the game.
	 * 
	 * @return This method returns a boolean data type
	 */
	public static boolean checkWinnerComputer() {

		if (board[1] == computerOption && board[2] == computerOption && board[3] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}
		if (board[1] == computerOption && board[5] == computerOption && board[9] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}
		if (board[1] == computerOption && board[4] == computerOption && board[7] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}
		if (board[2] == computerOption && board[5] == computerOption && board[8] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}
		if (board[3] == computerOption && board[6] == computerOption && board[9] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}
		if (board[4] == computerOption && board[5] == computerOption && board[6] == computerOption) {
			System.out.println("Computer won");
			b = false;
		}

		return b;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Tic-Tac-Toe game");
		createboard();
		chooseOption();
		toss();
		startGame();
	}

}

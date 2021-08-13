package com.TicTacToe;

import java.util.Scanner;

/*
 *  Program to create a TicTacToe game 
 * @author Ashwith
 */

public class TicTacToeGame {
	//variables 
	static char playerOption,computerOption;
	static Scanner sc=new Scanner(System.in);
	/*
	 * This is a function that is used to create a board for the gameplay.
	 * We are initializing the board with empty spaces and
	 * starting from index "1".
	 * @return This returns a board array
	 */
	public static char[] createboard(){
		char board[]=new char[10];
		for(int index=1;index<board.length;index++){
			board[index]=' ';
			}
		return board;
	}
	/*
	 * This is a method which allows the player to select either "X" or "O" as his/her option in the gameplay
	 */
	public static void chooseOption() {
		System.out.println("Which option do you want to choose.");
		System.out.println("1)'X' or 2)'O'");
		char s=sc.next().charAt(0);
		if(s=='X'){
			playerOption='X';
			computerOption='O';
		}
		else if(s=='O'){
			playerOption='O';
			computerOption='X';
		}
		else {
			System.out.println("Invalid option");
		}
		System.out.println("OK.You have selected "+s);
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic-Tac-Toe game");
		createboard();
		chooseOption();
		System.out.println(playerOption);
	} 
	
}

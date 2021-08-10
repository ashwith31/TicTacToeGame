package com.TicTacToe;

/*
 *  Program to create a tictactoe game 
 * @author Ashwith
 */

public class TicTacToeGame {

	public static void gameboard()
	{
		char board[]=new char[10];
		//method to give empty spaces to board array
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic-Tac-Toe game");
		//created an object 
		TicTacToeGame player=new TicTacToeGame();
		//calling the gameboard method using object
		player.gameboard();                      
		
	} 
	
}

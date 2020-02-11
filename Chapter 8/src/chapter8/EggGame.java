package chapter8;

import java.util.Scanner;

public class EggGame {
	
	public static Scanner input;
	public static boolean finished;
	
	public static void main(String[] args) {
		
		finished = false;
		
		input = new Scanner(System.in);
		
		heading();
		char[][] board = addEdge(makeBaseBoard());
		
		while(!finished) {
			placePiece(board);
			printBoard(board);
		}
	
	}

	static void printBoard(char[][] board) {
		
		for(int x = 0; x < 7; x++) {
			for(int y = 0; y < 7; y++) {
				System.out.print(board[x][y] + " ");
			}
			System.out.println();
		}
		
	}
	    
	static char[][] makeBaseBoard(){
		
		char[][] baseBoard = new char[7][7];
		
		for(int x = 0;x < 7; x++) {
			for(int y = 0; y < 7; y++) {
				if (x == 0 || y == 0) {
					baseBoard[x][y] = ' ';
				}else if (x == 1 && y == 1) {
					baseBoard[x][y] = 'O';
				}else if (x == 6 && y == 6) {
					baseBoard[x][y] = 'O';
				}else {
				baseBoard[x][y] = '-';
				}
			}
		}
		
		return baseBoard;
		
	}
	
	static char[][] addEdge(char[][] baseArray){
		char [][] arrayWithEdges = baseArray;
		
		arrayWithEdges[0][1] = '1';
		arrayWithEdges[0][2] = '2';
		arrayWithEdges[0][3] = '3';
		arrayWithEdges[0][4] = '4';
		arrayWithEdges[0][5] = '5';
		arrayWithEdges[0][6] = '6';
		arrayWithEdges[1][0] = '1';
		arrayWithEdges[2][0] = '2';
		arrayWithEdges[3][0] = '3';
		arrayWithEdges[4][0] = '4';
		arrayWithEdges[5][0] = '5';
		arrayWithEdges[6][0] = '6';
		
		return arrayWithEdges;
	}
	
	static char[][] placePiece(char[][] array){
		
		char[][] arrayWithPiece = array;
		
		System.out.print("Enter the X coordinate where you want to place the egg: ");
		int xIndex = input.nextInt();
		System.out.print("Enter the Y coordinate where you want to place the egg: ");
		int yIndex = input.nextInt();
		
		arrayWithPiece[xIndex][yIndex] = 'O';
		
		if (checkRow(arrayWithPiece)) {
			arrayWithPiece[xIndex][yIndex] = '-';
			System.out.println("You cannot place two Eggs in the same row");
		}else if (checkColumn(arrayWithPiece)) {
			arrayWithPiece[xIndex][yIndex] = '-';
			System.out.println("You cannot place two Eggs in the same column");
		}
		
		
		return arrayWithPiece;
		
	}
	
	static boolean checkRow(char[][] board) {
		
		boolean breaksRules = false;
		
		int timesCounted = 0;
		
		for (int xIndex = 1; xIndex < 7; xIndex++) {
			timesCounted = 0;
			for (int yIndex = 1; yIndex < 7; yIndex++) {
				if (board[xIndex][yIndex] == 'O') {
					timesCounted++;
				}
				if (timesCounted >= 2) {
					breaksRules = true;
				}
			}
		}
		
		return breaksRules;
	}
	
	static boolean checkColumn(char[][] board) {
		
		boolean breaksRules = false;
		
		int timesCounted = 0;
		
		for (int yIndex = 1; yIndex < 7; yIndex++) {
			timesCounted = 0;
			for (int xIndex = 1; xIndex < 7; xIndex++) {
				if(board[xIndex][yIndex] == 'O') {
					timesCounted++;
				}
				if (timesCounted >= 2) {
					breaksRules = true;
				}
			}
		}
		
		return breaksRules;
		
	}
	
static void heading() {
		
	  	System.out.println("---------------------------");
		System.out.println("|                         |");
		System.out.println("|      Samuel Herman      |");
		System.out.println("|   AP Computer Science   |");
		System.out.println("|        B Period         |");
		System.out.println("|       Heading MK2       |");
		System.out.println("|                         |");
		System.out.println("---------------------------");

	}
	
}

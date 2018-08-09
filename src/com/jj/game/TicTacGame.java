package com.jj.game;

// -------------------- TicTacGame.java ---------------------
import java.util.Scanner;

public class TicTacGame {
	private static int ROW = 3;
	private static int COL = 3;
	private static int TOTAL_BLOCKS = ROW * COL;
	private static char[][] BOARD = new char[ROW][COL];

	private static int winner = -1;
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		createBoard();
		do {
			printBoard();
			readPlayer1Input(scanner);
			if(checkWin()) {
				System.out.println("Winner is : Player " + winner);
				break;
			}
			count++;
			printBoard();
			if(count == TOTAL_BLOCKS) {
				break;
			}
			readPlayer2Input(scanner);
			if(checkWin()) {
				System.out.println("Winner is : Player " + winner);
				break;
			}
			count++;
		} while(true && count < TOTAL_BLOCKS);
		if(count == TOTAL_BLOCKS) {
			System.out.println("No one win..! Play again");
		}
		scanner.close();
	}
	private static void readPlayer1Input(Scanner scanner) {
		int row = -1;
		int col = -1;
		boolean hasPut = false;
		
		System.out.println("Player 1 : Please enter place to put 'X' for you");
		System.out.println("Enter row :");
		row = scanner.nextInt();
		System.out.println("Enter column :");
		col = scanner.nextInt();
		hasPut = putCharOnBoard(row-1, col-1, 'X');
		if(!hasPut) {
			readPlayer1Input(scanner);
		}
	}
	
	private static void readPlayer2Input(Scanner scanner) {
		int row = -1;
		int col = -1;
		boolean hasPut = false;
		
		System.out.println("Player 2 : Please enter place to put 'O' for you");
		System.out.println("Enter row :");
		row = scanner.nextInt();
		System.out.println("Enter column :");
		col = scanner.nextInt();
		hasPut = putCharOnBoard(row -1, col-1, 'O');
		if(!hasPut) {
			readPlayer2Input(scanner);
		}
	}
	private static void createBoard() {
		for(int i=0;i<BOARD.length;i++) {
			for(int j=0;j<BOARD[i].length;j++) {
				BOARD[i][j] = ' ';
			}
		}
	}
	
	private static void printBoard() {
		for(int i=0;i<BOARD.length;i++) {
			for(int j=0;j<BOARD[i].length;j++) {
				System.out.print(" "+BOARD[i][j]+ " | ");
			}
			System.out.println();
		}
	}
	
	// Place character on board
	private static boolean putCharOnBoard(int row, int col, char c) {
		if(BOARD[row][col] == ' ') {
			BOARD[row][col] = c;
			return true;
		} else {
			System.out.println("Block is not empty. Choose other block");
		}
		return false;
	}
	
	// We can enhance this function to work for more than 3 rows and columns.
	private static boolean checkWin() {
		if(BOARD[0][0] != ' ' && BOARD[0][0] == BOARD[0][1] && BOARD[0][0]== BOARD[0][2]) {
			assignWinner(BOARD[0][0]);
			return true;
		} else if (BOARD[1][0] != ' ' && BOARD[1][0] == BOARD[1][1] && BOARD[1][0]== BOARD[1][2]) {
			assignWinner(BOARD[1][0]);
			return true;
		} else if (BOARD[2][0] != ' ' && BOARD[2][0] == BOARD[2][1] && BOARD[2][0]== BOARD[2][2]) {
			assignWinner(BOARD[2][0]);
			return true;
		} else if (BOARD[0][0] != ' ' && BOARD[0][0] == BOARD[1][0] && BOARD[0][0]== BOARD[2][0]) {
			assignWinner(BOARD[0][0]);
			return true;
		} else if (BOARD[0][1] != ' ' && BOARD[0][1] == BOARD[1][1] && BOARD[0][1]== BOARD[2][1]) {
			assignWinner(BOARD[0][1]);
			return true;
		} else if (BOARD[0][2] != ' ' && BOARD[0][2] == BOARD[1][2] && BOARD[0][2]== BOARD[2][2]) {
			assignWinner(BOARD[0][2]);
			return true;
		} else if (BOARD[0][0] != ' ' && BOARD[0][0] == BOARD[1][1] && BOARD[0][0]== BOARD[2][2]) {
			assignWinner(BOARD[0][0]);
			return true;
		} else if (BOARD[0][2] != ' ' && BOARD[0][2] == BOARD[1][1] && BOARD[0][2]== BOARD[2][0]) {
			assignWinner(BOARD[0][2]);
			return true;
		}
		return false;
	}
	
	// check who is winner
	private static void assignWinner(char c) {
		if(c == 'X') {
			winner = 1;
		} else if (c == 'O'){
			winner = 2;
		}
	}
}

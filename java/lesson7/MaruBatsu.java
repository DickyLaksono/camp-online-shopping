package lesson7;

import java.util.Scanner;

/**
 * 
 * 
 * @author Furkan
 * @author Margarita
 * 
 */

public class MaruBatsu {

	private char[][] board;
	private char currentPlayer;

	public MaruBatsu() {
		board = new char[3][3];
		currentPlayer = 'X';
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	public void printBoard() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isWinner() {
		// Check rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
		}

		// Check columns
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
				return true;
			}
		}

		// Check diagonals
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
			return true;
		}
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
			return true;
		}

		return false;
	}

	public void makeMove(int row, int col) {
		board[row][col] = currentPlayer;
	}

	public void changePlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

	public static void main(String[] args) throws Exception {
		MaruBatsu game = new MaruBatsu();
		Scanner scanner = new Scanner(System.in);

		System.out.println("＊＊＊＊＊　マルバツゲーム　＊＊＊＊＊");
		System.out.println("プレーヤー ❌ からです。 \n列とコラムを入力してください。　（０~２ // よこ　＞　たて）");

		while (true) {

			Thread.sleep(500);
			System.out.println("\nボード:");
			game.printBoard();

			Thread.sleep(1000);
			System.out.println("\nプレーヤー " + game.currentPlayer + ", 入力してください。:");
			int row = scanner.nextInt();
			int col = scanner.nextInt();

			System.out.print("ボードに入力されています");
			for (int i = 0; i < 3; i++) {

				Thread.sleep(500);
				System.out.print("。");
			}

			System.out.print("\n");

			if (row < 0 || row > 2 || col < 0 || col > 2 || game.board[row][col] != '-') {
				System.out.println("入力間違っています、もう一回入力してください。");
				continue;
			}

			game.makeMove(row, col);

			if (game.isWinner()) {
				Thread.sleep(1000);
				System.out.println("\n\nプレーヤー " + game.currentPlayer + " の勝ちです。");

				Thread.sleep(500);
				System.out.println("\n\nおめでとうございます❕");
				break;
			}

			if (game.isBoardFull()) {
				Thread.sleep(500);
				System.out.println("引き分けです。");
				break;
			}

			game.changePlayer();
		}

		System.out.println("\n\n最終ボード:");
		game.printBoard();
		Thread.sleep(1200);
		System.out.println("\n＊＊＊＊＊＊　ゲーム終了　＊＊＊＊＊＊");

		scanner.close();
	}

}

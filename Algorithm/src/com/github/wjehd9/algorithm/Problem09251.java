package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem09251 {

	static String[] word = new String[2];

	static int[][] board;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			word[i] = scan.nextLine();
		}

		scan.close();

		int first = word[0].length();
		int second = word[1].length();

		board = new int[first][second + 1];

		int max = 0;

		for (int i = 0; i < first; i++) {
			int count = 0;
			for (int j = 1; j <= second; j++) {
				if (word[0].charAt(i) == word[1].charAt(j - 1)) {
					board[i][j] = Math.max(board[i][j], board[i][j - 1] + 1);
					count = Math.max(count, board[i][j]);
				} else {
					board[i][j] = count;
				}
			}
			max = Math.max(max, count);
		}

		for (int i = 0; i < first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println(max);
	}

}

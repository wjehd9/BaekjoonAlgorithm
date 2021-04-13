package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02580 {

	public static int[][] board;
	public static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = 9;
		board = new int[N][N];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		search(0, 0);

		sc.close();
	}

	public static void search(int x, int y) {
		if (x == N) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println("");
			}
			System.exit(0);
		}

		if (y == N) {
			search(x + 1, 0);
			return;
		}

		if (board[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(x, y, i)) {
					board[x][y] = i;
					search(x, y + 1);
				}
				board[x][y] = 0;
			}
		} else {
			search(x, y + 1);
		}

	}

	public static boolean check(int x, int y, int value) {
		// 가로
		for (int num = 0; num < N; num++) {
			if (board[x][num] == value) {
				return false;
			}
		}

		// 세로
		for (int num = 0; num < N; num++) {
			if (board[num][y] == value) {
				return false;
			}
		}

		// 3 * 3 영역
		for (int i = (x / 3) * 3; i < (x / 3) * 3 + 3; i++) {
			for (int j = (y / 3) * 3; j < (y / 3) * 3 + 3; j++) {
				if (board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}

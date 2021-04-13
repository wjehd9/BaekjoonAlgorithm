package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem09663 {

	public static int count = 0;
	public static int[] board;
	public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		board = new int[n];

		dp(0);
		System.out.println(count);

		sc.close();
	}

	public static void dp(int k) {
		if (k == n) {
			count++;
			return;
		}

		for (int i = 0; i < n; i++) {
			board[k] = i;

			if (check(k)) {
				dp(k + 1);
			}
		}
	}

	public static boolean check(int pos) {
		for (int i = 0; i < pos; i++) {
			if (board[i] == board[pos]) {
				return false;
			}

			else if (Math.abs(i - pos) == Math.abs(board[i] - board[pos])) {
				return false;
			}
		}
		return true;
	}

}

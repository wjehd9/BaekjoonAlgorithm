package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01463 {

	static int X;

	static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		X = scan.nextInt();

		dp = new int[X + 1];

		for (int i = 2; i <= X; i++) {
			if (i == 2 || i == 3) {
				dp[i] = 1;
			} else {
				dp[i] = dp[i - 1] + 1;

				if (i % 3 == 0) {
					dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);
				}

				if (i % 2 == 0) {
					dp[i] = Math.min(Math.min(dp[i - 1] + 1, dp[i / 2] + 1), dp[i]);
				}

			}
		}

		System.out.println(dp[X]);

		scan.close();
	}

}

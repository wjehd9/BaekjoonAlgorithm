package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem10844 {

	static int N;

	static int[][] num;
	static long answer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		num = new int[N + 1][10];

		for (int i = 1; i < 10; i++) {
			num[1][i] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					num[i][j] = num[i - 1][1] % 1000000000;
				} else if (j == 9) {
					num[i][j] = num[i - 1][8] % 1000000000;
				} else {
					num[i][j] = (num[i - 1][j - 1] + num[i - 1][j + 1]) % 1000000000;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			answer += num[N][i];
		}

		System.out.println(answer % 1000000000);

		scan.close();
	}

}

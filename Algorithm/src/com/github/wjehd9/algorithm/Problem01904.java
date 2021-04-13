package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01904 {

	static int N;

	static int[] arr = new int[1000001];
	static int answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			dp(i);
		}

		answer = arr[N];
		System.out.println(answer);

		scan.close();
	}

	static void dp(int n) {
		if (n == 1) {
			arr[n] = 1;
		} else if (n == 2) {
			arr[n] = 2;
		} else {
			arr[n] = ((arr[n - 2] % 15746) + (arr[n - 1] % 15746)) % 15746;
		}
	}

}

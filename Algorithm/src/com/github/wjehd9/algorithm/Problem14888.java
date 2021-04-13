package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem14888 {
	public static int N;
	public static int[] num;

	public static int max = -2000000000;
	public static int min = 2000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
		}

		int[] category = new int[4];
		for (int i = 0; i < 4; i++) {
			category[i] = scan.nextInt();
		}

		dp(0, category, 0);

		System.out.println(max);
		System.out.println(min);

		scan.close();
	}

	public static void dp(int index, int[] arr, int result) {
		if (index == 0) {
			result = num[0];
		}

		if (index == N - 1) {
			if (max < result) {
				max = result;
			}

			if (min > result) {
				min = result;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (arr[i] > 0) {
				arr[i]--;

				if (i == 0) {
					dp(index + 1, arr, result + num[index + 1]);
				} else if (i == 1) {
					dp(index + 1, arr, result - num[index + 1]);
				} else if (i == 2) {
					dp(index + 1, arr, result * num[index + 1]);
				} else if (i == 3) {
					dp(index + 1, arr, result / num[index + 1]);
				}

				arr[i]++;
			}

		}
	}

}

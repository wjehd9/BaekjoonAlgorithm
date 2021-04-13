package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int x, y;

		long[] dist = new long[t];

		for (int i = 0; i < t; i++) {
			x = scan.nextInt();
			y = scan.nextInt();

			dist[i] = dp(y - x);
		}

		for (int i = 0; i < t; i++) {
			System.out.println(dist[i]);
		}

		scan.close();
	}

	static long dp(int n) {
		long count = 1;
		long k;
		for (;; count++) {
			if (count * count > n) {
				break;
			}
		}

		count--;
		k = n - count * count;

		k = (long) Math.ceil((double) k / (double) count);

		return 2 * count - 1 + k;
	}
}

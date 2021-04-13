package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] num = new int[1001];
		int count = 0;

		for (int i = 1; i <= n; i++) {
			num[i] = cal(i);

			if (num[i] == 1) {
				count++;
			}
		}

		System.out.println(count);

		scan.close();
	}

	static int cal(int k) {
		int[] a = new int[4];
		int number = k;
		int count = 0;

		while (k > 0) {
			a[count] = k % 10;
			k /= 10;
			count++;
		}

		if (number < 100) {
			return 1;
		} else if (number < 1000) {
			int m = a[0] - a[1];
			int n = a[1] - a[2];

			if (m == n) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

}

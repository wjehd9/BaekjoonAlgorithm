package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem09020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int n;

		int[] a = new int[t];
		int[] b = new int[t];
		boolean j1, j2;

		for (int i = 0; i < t; i++) {
			n = scan.nextInt();

			int min = 99999;

			inner: for (a[i] = n / 2; a[i] > 1; a[i]--) {
				b[i] = n - a[i];

				j1 = check(a[i]);
				j2 = check(b[i]);

				if (j1 && j2) {
					if (min > b[i] - a[i]) {
						min = b[i] - a[i];
						break inner;
					}
				}
			}
		}

		for (int i = 0; i < t; i++) {
			System.out.println(a[i] + " " + b[i]);
		}

		scan.close();
	}

	static boolean check(int k) {
		int save = k;
		int plus = 2;

		while (k > 1) {
			if (save == plus) {
				return true;
			}
			if (k % plus == 0) {
				k /= plus;
			} else {
				plus++;
			}
		}
		return false;
	}

}

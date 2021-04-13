package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02851 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int m, n;

		m = scan.nextInt();
		n = scan.nextInt();

		int total = 0;
		int min = 99999;

		for (int i = m; i <= n; i++) {
			int temp = i;
			int plus = 2;

			inner: while (temp >= 1) {
				if (temp == 1) {
					break inner;
				}
				if (i == plus) {
					total += i;

					if (i < min) {
						min = i;
					}
				}
				if (temp % plus == 0) {
					temp /= plus;
				} else {
					plus++;
				}
			}
		}

		if (min == 99999) {
			System.out.println(-1);
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int count;
		count = cal(3, 5, n);

		System.out.println(count);
	}

	static int cal(int a, int b, int n) {
		int x = 0, y = 9999, min = 9999;

		while (x <= n / a) {
			if ((n - a * x) % b == 0) {
				y = (n - a * x) / b;
			}

			if (min > x + y) {
				min = x + y;
			}

			x++;
		}

		if (y == 9999) {
			min = -1;
		}

		return min;
	}

}

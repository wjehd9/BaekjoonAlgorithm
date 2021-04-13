package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();

		int[] m = new int[3];
		int[] n = new int[3];

		int count = 0;
		while (a > 0) {
			m[count++] = a % 10;
			a /= 10;
		}

		count = 0;
		while (b > 0) {
			n[count++] = b % 10;
			b /= 10;
		}

		a = 100 * m[0] + 10 * m[1] + m[2];
		b = 100 * n[0] + 10 * n[1] + n[2];

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x, n = 0, save;
		x = scan.nextInt();

		save = x;

		int a, b;

		while (true) {
			if (x < 10) {
				a = 0;
				b = x;
				n++;
			} else {
				a = x / 10;
				b = x % 10;
				n++;
			}

			x = 10 * b + ((a + b) % 10);

			if (save == x) {
				break;
			}
		}

		System.out.println(n);

		scan.close();
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();

		int b3, b2, b1;

		b3 = b / 100;
		b2 = (b - 100 * b3) / 10;
		b1 = b - (100 * b3 + 10 * b2);

		System.out.println(a * b1);
		System.out.println(a * b2);
		System.out.println(a * b3);

		System.out.println(a * (b3 * 100 + b2 * 10 + b1));
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a, b;

		while (true) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (a == 0 && b == 0) {
				break;
			}

			System.out.println(a + b);

		}
	}

}

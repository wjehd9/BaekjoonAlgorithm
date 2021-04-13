package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a, b, v;

		a = scan.nextInt();
		b = scan.nextInt();
		v = scan.nextInt();

		int n;

		if ((v - a) % (a - b) == 0) {
			n = (v - a) / (a - b);
		} else {
			n = (v - a) / (a - b) + 1;
		}

		System.out.println(n + 1);
	}

}

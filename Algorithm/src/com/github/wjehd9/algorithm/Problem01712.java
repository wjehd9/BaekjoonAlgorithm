package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		long a, b, c;

		a = scan.nextLong();
		b = scan.nextLong();
		c = scan.nextLong();

		long num;

		num = many(a, b, c);

		System.out.println(num);

		scan.close();
	}

	private static long many(long a, long b, long c) {
		if (b >= c) {
			return -1;
		}

		long count = 0;

		while (count <= a / (c - b)) {
			count++;
		}

		return count;
	}

}

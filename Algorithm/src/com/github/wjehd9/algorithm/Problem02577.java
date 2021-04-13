package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int result = a * b * c;
		String s = Integer.toString(result);

		int[] num = new int[10];
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) % 48;
			num[temp]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}

}

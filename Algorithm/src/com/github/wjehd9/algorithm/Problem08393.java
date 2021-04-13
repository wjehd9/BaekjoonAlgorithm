package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem08393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		int result = sum(a);
		System.out.println(result);
	}

	static int sum(int n) {
		int k = 0;
		for (int i = 1; i <= n; i++) {
			k += i;
		}
		return k;
	}

}

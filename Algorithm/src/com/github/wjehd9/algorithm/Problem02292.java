package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int result = cal(n);

		System.out.println(result);
	}

	static int cal(int n) {
		int count = 1;
		int total;
		if (n > 1) {
			total = 1;
			while (total < n) {
				total += count * 6;
				count++;
			}
		}

		return count;
	}

}

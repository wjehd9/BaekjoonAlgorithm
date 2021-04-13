package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem08958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] score = new int[n];
		String test;

		for (int i = 0; i < n; i++) {
			test = scan.next();
			score[i] = check(test, 0, 0, 0);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(score[i]);
		}

		scan.close();
	}

	static int check(String k, int sum, int index, int count) {
		if (index == k.length()) {
			return sum;
		} else {
			if (k.charAt(index) == 79) {
				count++;
				sum += count;
				return check(k, sum, index + 1, count);
			} else {
				return check(k, sum, index + 1, 0);
			}
		}
	}

}

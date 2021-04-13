package com.github.wjehd9.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = scan.nextInt();
		}

		Arrays.sort(number);
		for (int i = 0; i < n; i++) {
			System.out.println(number[i]);
		}

		scan.close();
	}

}

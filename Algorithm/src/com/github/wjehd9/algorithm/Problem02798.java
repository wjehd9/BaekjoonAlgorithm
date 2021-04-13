package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n, m;

		n = scan.nextInt();
		m = scan.nextInt();

		int[] num = new int[n];
		int max = 0, sum;

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = num[i] + num[j] + num[k];
					if (sum <= m && max <= sum) {
						max = sum;
					}
				}
			}
		}

		System.out.println(max);
	}

}

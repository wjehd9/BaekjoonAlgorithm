package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		scan.close();

		result(a, x);
	}

	static void result(int[] n, int x) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] < x) {
				System.out.print(n[i]);

				if (i != (n.length - 1)) {
					System.out.print(" ");
				}
			}
		}
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem15652 {

	static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n, m;

		n = scan.nextInt();
		m = scan.nextInt();

		arr = new int[m];

		save(n, m, arr, 0);

		scan.close();
	}

	static void save(int n, int m, int[] arr, int count) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (count == 0) {
				arr[count] = i;
				save(n, m, arr, count + 1);
			} else {
				if (i >= arr[count - 1]) {
					arr[count] = i;
					save(n, m, arr, count + 1);
				}
			}
		}
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int[] people = new int[t];

		int k, n;

		for (int i = 0; i < t; i++) {
			k = scan.nextInt();
			n = scan.nextInt();

			people[i] = house(k, n);
		}

		for (int i = 0; i < t; i++) {
			System.out.println(people[i]);
		}
	}

	static int house(int floor, int room) {
		int[][] arr = new int[floor + 1][room + 1];
		for (int i = 0; i <= room; i++) {
			arr[0][i] = i;
		}

		for (int j = 0; j <= floor; j++) {
			arr[j][0] = 0;
		}

		for (int i = 1; i <= floor; i++) {
			for (int j = 1; j <= room; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}

		return arr[floor][room];
	}

}

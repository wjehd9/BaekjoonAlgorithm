package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem09461 {

	static int N;

	static int[] arr;

	static long[] down = new long[50];
	static long[] up = new long[50];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		arr = new int[N];

		for (int i = 0; i < 50; i++) {
			upSide(i);
			downSide(i);
		}

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			// up
			if (arr[i] % 2 == 1) {
				System.out.println(up[arr[i] / 2]);
			}

			// down
			else {
				System.out.println(down[arr[i] / 2 - 1]);
			}
		}

		scan.close();
	}

	static void upSide(int n) {
		if (n <= 1) {
			up[n] = 1;
		} else if (n == 2) {
			up[2] = 2;
		} else {
			up[n] = down[n - 1] + down[n - 3];
		}
	}

	static void downSide(int n) {
		if (n == 0) {
			down[0] = 1;
		} else if (n == 1) {
			down[1] = 2;
		} else if (n == 2) {
			down[2] = 3;
		} else if (n == 3) {
			down[3] = 5;
		} else {
			down[n] = up[n] + up[n - 2];
		}
	}

}

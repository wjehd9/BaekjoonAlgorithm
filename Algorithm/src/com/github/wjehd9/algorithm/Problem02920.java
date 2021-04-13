package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] a = new int[8];

		for (int i = 0; i < 8; i++) {
			a[i] = scan.nextInt();
		}

		int num = 1;

		check(a, num);
	}

	static void check(int[] n, int num) {
		if (n[0] == 1) {
			if (n[num - 1] == num) {
				if (num == 8) {
					System.out.println("ascending");
					return;
				}
				check(n, num + 1);
			} else {
				System.out.println("mixed");
				return;
			}
		} else if (n[0] == 8) {
			if (n[num - 1] + num == 9) {
				if (num == 8) {
					System.out.println("descending");
					return;
				}
				check(n, num + 1);
			} else {
				System.out.println("mixed");
				return;
			}
		} else {
			System.out.println("mixed");
			return;
		}
	}

}

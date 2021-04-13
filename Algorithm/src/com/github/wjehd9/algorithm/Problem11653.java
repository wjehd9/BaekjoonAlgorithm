package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int devide = 2;

		while (true) {
			if (n == 1) {
				break;
			}
			if (n % devide == 0) {
				System.out.println(devide);
				n /= devide;
			} else {
				devide++;
			}

		}

		sc.close();
	}

}

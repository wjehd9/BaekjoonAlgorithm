package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		int x1, y1, r1, x2, y2, r2;
		double dist;

		for (int i = 0; i < t; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();

			r1 = scan.nextInt();

			x2 = scan.nextInt();
			y2 = scan.nextInt();

			r2 = scan.nextInt();

			dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

			int n = 0;

			if (r1 + r2 < dist) {
				n = 1;
			}
			if (r1 + r2 == dist) {
				n = 2;
			}
			if (r1 + r2 > dist) {
				n = 3;
			}
			if (Math.abs(r1 - r2) == dist) {
				n = 4;
			}
			if (Math.abs(r1 - r2) > dist) {
				n = 5;
			}
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				n = 6;
			}

			switch (n) {
			case 1:
				System.out.println(0);
				break;
			case 2:
				System.out.println(1);
				break;
			case 3:
				System.out.println(2);
				break;
			case 4:
				System.out.println(1);
				break;
			case 5:
				System.out.println(0);
				break;
			case 6:
				System.out.println(-1);
				break;
			}
		}

		scan.close();
	}

}

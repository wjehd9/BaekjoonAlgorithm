package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int h, m;

		h = scan.nextInt();
		m = scan.nextInt();

		if (m < 45) {
			h = h - 1;
			m = m + 15;
		} else {
			m = m - 45;
		}

		if (h < 0) {
			h = h + 24;
		}

		System.out.printf("%d ", h);
		System.out.printf("%d", m);

		scan.close();
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x, y, w, h;

		x = scan.nextInt();
		y = scan.nextInt();
		w = scan.nextInt();
		h = scan.nextInt();

		int dist = 999;

		if (x < dist) {
			dist = x;
		}
		if (y < dist) {
			dist = y;
		}
		if (h - y < dist) {
			dist = h - y;
		}
		if (w - x < dist) {
			dist = w - x;
		}

		System.out.println(dist);

		scan.close();
	}

}

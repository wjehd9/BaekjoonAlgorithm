package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem11729 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println((1 << n) - 1);
		StringBuilder sb = new StringBuilder();
		solve(n, 1, 3, sb);
		System.out.println(sb);
	}

	static void solve(int n, int x, int y, StringBuilder sb) {
		if (n == 0) {
			return;
		}
		solve(n - 1, x, 6 - x - y, sb);
		sb.append(x + " " + y + "\n");
		solve(n - 1, 6 - x - y, y, sb);
	}
}

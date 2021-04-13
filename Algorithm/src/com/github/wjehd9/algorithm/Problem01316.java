package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			String line = scan.next();

			count = count + check(line);
		}

		System.out.println(count);

		scan.close();
	}

	private static int check(String s) {
		int k = s.length();

		int[] site = new int[26];

		for (int i = 0; i < 26; i++) {
			site[i] = -1;
		}

		for (int i = 0; i < k; i++) {
			if (site[s.charAt(i) - 97] == -1 || i - site[s.charAt(i) - 97] == 1) {
				site[s.charAt(i) - 97] = i;
			} else {
				if (i - site[s.charAt(i) - 97] > 1) {
					return 0;
				}
			}
		}
		return 1;

	}

}

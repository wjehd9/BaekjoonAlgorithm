package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		int[] spell = new int[26];
		for (int i = 0; i < 26; i++) {
			spell[i] = -1;
		}

		for (int i = 0; i < 26; i++) {
			if (spell[i] == -1) {
				for (int j = 0, k = s.length(); j < k; j++) {
					spell[s.codePointAt(j) - 97] = s.indexOf(String.format("%c", s.charAt(j)));
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(spell[i]);
			if (i < 25) {
				System.out.print(" ");
			}
		}
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		int count = 0;

		boolean check = false;

		for (int i = 0, k = s.length(); i < k; i++) {
			if (s.charAt(i) == 32) {
				check = false;
			} else {
				if (check == false) {
					check = true;

					count++;
				}
			}
		}

		System.out.println(count);

		scan.close();
	}

}

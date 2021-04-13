package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int number = 1;
		int count = 0;

		String text = "666";

		while (true) {
			if (Integer.toString(number).contains(text)) {
				count++;
			}

			if (count == n) {
				break;
			}

			number++;
		}

		System.out.println(number);

		scan.close();
	}

}

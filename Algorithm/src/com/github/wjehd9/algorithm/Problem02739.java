package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem02739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}

}

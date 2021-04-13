package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem03053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();

		System.out.println(Math.round(Math.PI * r * r * 1000000) / 1000000.0);
		System.out.println(2 * r * r);
	}

}

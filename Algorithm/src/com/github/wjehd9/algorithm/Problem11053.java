package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] num = new int[N + 1];

		String[] input = br.readLine().split(" ");
		for (int i = 1; i <= N; i++) {
			num[i] = Integer.parseInt(input[i - 1]);
		}

		int[] save = new int[N + 1];

		num[0] = 0;
		save[0] = 0;

		save[1] = 1;

		int max = 1;

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] > num[j]) {
					save[i] = Math.max(save[i], save[j] + 1);
				}
			}
			max = Math.max(max, save[i]);
		}

		System.out.print(max);
	}

}

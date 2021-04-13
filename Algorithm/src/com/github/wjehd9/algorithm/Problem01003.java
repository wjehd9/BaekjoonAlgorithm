package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem01003 {

	static int N;
	static int[] arr;

	static int[][] save = new int[41][2];

	static int count_0;
	static int count_1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < 41; i++) {
			if (i == 0) {
				save[i][0] = 1;
				save[i][1] = 0;
			} else if (i == 1) {
				save[i][0] = 0;
				save[i][1] = 1;
			} else {
				save[i][0] = save[i - 2][0] + save[i - 1][0];
				save[i][1] = save[i - 2][1] + save[i - 1][1];
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(save[arr[i]][0] + " " + save[arr[i]][1]);
		}
	}
}

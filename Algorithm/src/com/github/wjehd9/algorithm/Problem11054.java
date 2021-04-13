package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11054 {

	static int N;
	static int[] num;
	static int[] dpLeft;
	static int[] dpRight;
	static int[] dp;

	static int max = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		num = new int[N + 1];
		dpLeft = new int[N + 1];
		dpRight = new int[N + 1];
		dp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 1; i <= N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			dpLeft[i] = 1;
			for (int j = 1; j < i; j++) {
				if (num[i] > num[j]) {
					dpLeft[i] = Math.max(dpLeft[i], dpLeft[j] + 1);
				}
			}
		}

		for (int i = N; i >= 1; i--) {
			dpRight[i] = 1;

			for (int j = N; j > i; j--) {
				if (num[i] > num[j]) {
					dpRight[i] = Math.max(dpRight[i], dpRight[j] + 1);
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			dp[i] = dpLeft[i] + dpRight[i] - 1;
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}

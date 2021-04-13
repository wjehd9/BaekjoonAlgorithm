package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem02156 {

	static int N;
	static int[] glass;
	static int[] dp;

	static int last = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		glass = new int[N + 1];
		dp = new int[N + 1];

		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			glass[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = 0;
		dp[1] = glass[1];

		if (N >= 2) {
			dp[2] = glass[1] + glass[2];
		}

		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + glass[i - 1]) + glass[i]);
		}

		System.out.println(dp[N]);

	}

}

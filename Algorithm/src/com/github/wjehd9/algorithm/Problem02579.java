package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem02579 {

	static int N;
	static int[] stair;

	static int[] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		stair = new int[N + 1];
		dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			stair[i] = Integer.parseInt(st.nextToken());
		}

		dp[1] = stair[1];

		if (N >= 2) {
			dp[2] = stair[1] + stair[2];
		}

		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
		}

		System.out.println(dp[N]);

		br.close();
	}

}

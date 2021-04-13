package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Problem02565 {

	static int N;

	static int[][] board;
	static Integer[] dp;

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		board = new int[N + 1][2];
		dp = new Integer[N + 1];

		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			board[i][0] = Integer.parseInt(st.nextToken());
			board[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(board, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}

		});

		int max = 0;

		for (int i = 1; i <= N; i++) {
			max = Math.max(max, wire(i));
		}

		System.out.println(N - max);

	}

	static int wire(int index) {
		if (dp[index] == null) {
			dp[index] = 1;

			for (int i = index + 1, k = dp.length; i < k; i++) {
				if (board[index][1] < board[i][1]) {
					dp[index] = Math.max(dp[index], wire(i) + 1);
				}
			}
		}

		return dp[index];
	}

}

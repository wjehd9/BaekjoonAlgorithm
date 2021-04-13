package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14889 {
	public static int N;
	public static int[][] board;

	public static boolean[] people;

	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		people = new boolean[N];

		board = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp(0);

		System.out.println(min);
	}

	public static void dp(int num) {
		if (num == N / 2) {
			int start = 0;
			int link = 0;

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (people[i] == true && people[j] == true) {
						start += board[i][j];
						start += board[j][i];
					}

					else if (people[i] == false && people[j] == false) {
						link += board[i][j];
						link += board[j][i];
					}
				}
			}

			int value = Math.abs(start - link);

			if (value == 0) {
				System.out.println(0);
				System.exit(0);
			}

			min = Math.min(min, value);

			return;
		}

		for (int i = num; i < N; i++) {
			if (!people[i]) {
				people[i] = true;
				dp(num + 1);
				people[i] = false;
			}
		}
	}

}

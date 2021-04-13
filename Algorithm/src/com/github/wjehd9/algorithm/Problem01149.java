package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem01149 {

	static int N;

	static int[][] price;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		price = new int[N][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			price[i][0] = Integer.parseInt(st.nextToken());
			price[i][1] = Integer.parseInt(st.nextToken());
			price[i][2] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < N; i++) {
			price[i][0] += Math.min(price[i - 1][1], price[i - 1][2]);
			price[i][1] += Math.min(price[i - 1][0], price[i - 1][2]);
			price[i][2] += Math.min(price[i - 1][0], price[i - 1][1]);
		}

		System.out.println(Math.min(Math.min(price[N - 1][0], price[N - 1][1]), price[N - 1][2]));

		br.close();
	}

}

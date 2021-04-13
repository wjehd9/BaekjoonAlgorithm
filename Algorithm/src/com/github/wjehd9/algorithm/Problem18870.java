package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem18870 {

	static int N;
	static int[] site;
	static int[] answer;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		site = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			site[i] = Integer.parseInt(st.nextToken());
		}

		answer = site.clone();
		Arrays.sort(answer);

		Map<Integer, Integer> map = new HashMap<>();

		int index = 0;
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(answer[i])) {
				map.put(answer[i], index++);
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(map.get(site[i])).append(" ");
		}

		System.out.println(sb.toString());

	}

}

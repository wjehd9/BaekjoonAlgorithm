package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Problem11650 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[][] site = new int[n][2];

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();

			site[i][0] = Integer.parseInt(temp.split(" ")[0]);
			site[i][1] = Integer.parseInt(temp.split(" ")[1]);
		}

		Arrays.sort(site, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				} else {
					return Integer.compare(o1[0], o2[0]);
				}
			}

		});

		for (int i = 0; i < n; i++) {
			bw.write(site[i][0] + " " + site[i][1] + "\n");
		}

		bw.close();
		br.close();
	}

}

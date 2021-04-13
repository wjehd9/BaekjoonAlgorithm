package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Problem02108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[8001];
		double sum = 0, avg;
		int center, min = 9999, max = -9999, gap;
		int freq = 0, count = 0, save = 0;

		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[4000 + temp]++;
			num.add(temp);

			sum += temp;

			if (temp < min) {
				min = temp;
			}

			if (temp > max) {
				max = temp;
			}
		}

		avg = sum / n;

		Collections.sort(num);
		center = num.get(n / 2);

		for (int i = 0; i < 8001; i++) {
			if (arr[i] > 0) {
				if (arr[i] == count && freq == 1) {
					save = i - 4000;
					freq = 2;
				}

				if (arr[i] > count) {
					count = arr[i];
					save = i - 4000;
					freq = 1;
				}
			}
		}

		if (n == 1) {
			gap = 0;
		} else {
			gap = max - min;
		}

		bw.write(Math.round(avg) + "\n");
		bw.write(center + "\n");
		bw.write(save + "\n");
		bw.write(gap + "\n");

		bw.flush();
		bw.close();
		br.close();
	}

}

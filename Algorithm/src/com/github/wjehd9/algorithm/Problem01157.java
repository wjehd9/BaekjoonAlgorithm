package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem01157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		s = s.toUpperCase();

		int[] spell = new int[26];
		int max = 0;
		char result = '?';

		for (int i = 0, m = s.length(); i < m; i++) {
			int up = s.charAt(i);
			spell[up - 65]++;
			if (max < spell[up - 65]) {
				max = spell[up - 65];
				result = s.charAt(i);
			} else if (max == spell[up - 65]) {
				result = '?';
			}
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

}

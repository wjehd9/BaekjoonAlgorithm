package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem02742 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = n; i > 0; i--) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}

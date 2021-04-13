package com.github.wjehd9.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem09184 {

	static int a, b, c;

	static boolean[] check = new boolean[9261];
	static int[] save = new int[9261];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
				for (int k = 0; k <= 20; k++) {
					if (i <= 0 || j <= 0 || k <= 0) {
						save[i * 441 + j * 21 + k] = 1;
					} else {
						if (i < j && j < k) {
							save[i * 441 + j * 21 + k] = save[i * 441 + j * 21 + (k - 1)]
									+ save[i * 441 + (j - 1) * 21 + (k - 1)] - save[i * 441 + (j - 1) * 21 + k];
						} else {
							save[i * 441 + j * 21 + k] = save[(i - 1) * 441 + j * 21 + k]
									+ save[(i - 1) * 441 + (j - 1) * 21 + k] + save[(i - 1) * 441 + j * 21 + (k - 1)]
									- save[(i - 1) * 441 + (j - 1) * 21 + (k - 1)];
						}
					}
				}
			}
		}

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) {
				System.exit(0);
			}

			int result;
			if (a <= 0 || b <= 0 || c <= 0) {
				result = 1;
			} else if (a > 20 || b > 20 || c > 20) {
				result = save[9260];
			} else {
				result = save[a * 441 + b * 21 + c];
			}

			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
		}
	}

}

package com.github.wjehd9.algorithm;

public class Problem15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3000000];
		sum(a);
	}

	static long sum(int[] a) {
		long total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}

}

package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double[] score = new double[n];

		for (int i = 0; i < n; i++) {
			score[i] = scan.nextInt();
		}

		double maxScore;
		maxScore = max(score, n);

		for (int i = 0; i < n; i++) {
			score[i] = score[i] / maxScore * 100;
		}

		double avgScore;
		avgScore = average(score, n);

		System.out.println(avgScore);

		scan.close();
	}

	private static double max(double[] n, int k) {
		double max = 0;

		for (int i = 0; i < k; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}

	private static double average(double[] n, int k) {
		double average = 0;
		double total = 0;

		for (int i = 0; i < k; i++) {
			total += n[i];
		}
		average = total / k;

		return average;
	}

}

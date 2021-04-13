package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem04344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int c = scan.nextInt();

		int n;
		double[] score;
		double[] average = new double[c];
		double[] ratio = new double[c];

		for (int i = 0; i < c; i++) {
			n = scan.nextInt();
			score = new double[n];
			try {
				for (int j = 0; j < n; j++) {
					score[j] = scan.nextDouble();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			average[i] = cal(score, n);
			ratio[i] = rat(score, average[i], n);
		}

		for (int i = 0; i < c; i++) {
			System.out.println(String.format("%.3f", ratio[i]) + "%");
		}
	}

	static double cal(double[] k, int m) {
		int total = 0;
		for (int i = 0; i < m; i++) {
			total += k[i];
		}
		return (total / m);
	}

	static double rat(double[] sc, double avg, int m) {
		double count = 0;
		for (int i = 0; i < m; i++) {
			if (sc[i] > avg) {
				count++;
			}
		}
		return (count / m) * 100;
	}
}

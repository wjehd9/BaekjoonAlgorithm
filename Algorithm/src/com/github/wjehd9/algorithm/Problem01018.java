package com.github.wjehd9.algorithm;

import java.util.Scanner;

public class Problem01018 {

	static char[][] white = {
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', } };

	static char[][] black = {
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
			{
					'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W', },
			{
					'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n, m;

		n = scan.nextInt();
		m = scan.nextInt();

		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = scan.next();

			for (int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j);
			}
		}

		int min = 9999999;
		int count1, count2;

		for (int i = 0; i + 7 < n; i++) {
			for (int j = 0; j + 7 < m; j++) {
				count1 = 0;
				count2 = 0;

				for (int y = i; y < i + 8; y++) {
					for (int x = j; x < j + 8; x++) {
						if (board[y][x] != white[y - i][x - j]) {
							count1++;
						}
					}
				}

				for (int y = i; y < i + 8; y++) {
					for (int x = j; x < j + 8; x++) {
						if (board[y][x] != black[y - i][x - j]) {
							count2++;
						}
					}
				}

				if (count1 < min) {
					min = count1;
				}

				if (count2 < min) {
					min = count2;
				}

			}
		}

		System.out.println(min);

		scan.close();
	}

}

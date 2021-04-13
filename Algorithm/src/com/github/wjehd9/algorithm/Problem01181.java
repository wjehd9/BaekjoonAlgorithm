package com.github.wjehd9.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem01181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		ArrayList<String> words = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			words.add(scan.next());
		}

		Collections.sort(words, new MyComparator01181());

		System.out.println(words.get(0));
		for (int i = 1; i < n; i++) {
			if (words.get(i - 1).equals(words.get(i))) {
				continue;
			}

			System.out.println(words.get(i));
		}

		scan.close();
	}

}

class MyComparator01181 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			if (o1.compareTo(o2) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}

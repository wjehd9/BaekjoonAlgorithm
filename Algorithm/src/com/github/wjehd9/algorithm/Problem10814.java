package com.github.wjehd9.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		Object[][] members = new Object[n][3];

		for (int i = 0; i < n; i++) {
			members[i][0] = scan.nextInt();
			members[i][1] = scan.next();
			members[i][2] = i;
		}

		Arrays.sort(members, new MyComporator10814());

		for (int i = 0; i < n; i++) {
			System.out.println(members[i][0] + " " + members[i][1]);
		}

		scan.close();
	}

}

class MyComporator10814 implements Comparator<Object[]> {

	@Override
	public int compare(Object[] o1, Object[] o2) {
		// TODO Auto-generated method stub
		if ((int) o1[0] > (int) o2[0]) {
			return 1;
		} else if ((int) o1[0] < (int) o2[0]) {
			return -1;
		} else {
			if ((int) o1[2] > (int) o2[2]) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}

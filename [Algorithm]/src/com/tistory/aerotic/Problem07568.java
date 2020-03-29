package com.tistory.aerotic;

import java.util.Scanner;

public class Problem07568 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] x = new int[n];
    int[] y = new int[n];
    int[] rank = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = scan.nextInt();
      y[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      rank[i] = 1;
      for (int j = 0; j < n; j++) {
        if (x[i] < x[j] && y[i] < y[j]) {
          rank[i] += 1;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(rank[i] + " ");
    }

    scan.close();
  }

}

package com.tistory.aerotic;

import java.util.Scanner;

public class Problem03009 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int[] x = new int[1001];
    int[] y = new int[1001];

    int a, b;

    for (int i = 0; i < 3; i++) {
      a = scan.nextInt();
      b = scan.nextInt();

      x[a]++;
      y[b]++;
    }

    int result_x = 0, result_y = 0;

    for (int i = 1; i < 1001; i++) {
      if (x[i] == 1) {
        result_x = i;
      }
      if (y[i] == 1) {
        result_y = i;
      }
    }

    System.out.println(result_x + " " + result_y);
  }

}

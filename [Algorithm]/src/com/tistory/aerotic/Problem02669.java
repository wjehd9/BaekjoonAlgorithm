package com.tistory.aerotic;

import java.util.Scanner;

public class Problem02669 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int[][] site = new int[101][101];

    int a, b, c, d;
    for (int n = 0; n < 4; n++) {
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      d = scan.nextInt();

      for (int i = a + 1; i <= c; i++) {
        for (int j = b + 1; j <= d; j++) {
          if (site[i][j] == 0) {
            site[i][j] = 1;
          }
        }
      }
    }

    int count = 0;

    for (int i = 1; i <= 100; i++) {
      for (int j = 1; j <= 100; j++) {
        if (site[i][j] == 1) {
          count++;
        }
      }
    }

    System.out.println(count);

    scan.close();
  }

}

package com.tistory.aerotic;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02447 {

  static char[][] mat;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    mat = new char[n][n];

    for (int i = 0; i < n; i++) {
      Arrays.fill(mat[i], ' ');
    }

    star(0, 0, n);

    for (int i = 0; i < n; i++) {
      System.out.println(mat[i]);
    }
    scan.close();
  }

  static void star(int y, int x, int k) {
    if (k == 1) {
      mat[y][x] = '*';
      return;
    }

    int div = k / 3;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
          continue;
        } else {
          star(y + (i * div), x + (j * div), div);
        }
      }
    }
  }

}

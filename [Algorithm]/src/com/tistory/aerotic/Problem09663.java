package com.tistory.aerotic;

import java.util.Scanner;

public class Problem09663 {

  static int[][] board;
  static int result = 0;
  static int n;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();

    for (int j = 0; j < n; j++) {
      board = new int[n][n];
      board[0][j] = 1;
      game(0, j);
    }

    System.out.println("result : " + result);

    scan.close();
  }

  private static void game(int x, int y) {
    if (x == n - 1) {
      result++;
    } else {
      for (int j = 0; j < n; j++) {
        if (check(x + 1, j)) {
          board[x + 1][j] = 1;
          game(x + 1, j);
        }
      }
    }
  }

  private static boolean check(int x, int y) {
    for (int i = 0; i < x; i++) {
      // if (board[i][y] == 1) {
      // return false;
      // }
      //
      // if (board[Math.abs(x - i)][y] == 1) {
      // return false;
      // }
    }

    return true;
  }

}

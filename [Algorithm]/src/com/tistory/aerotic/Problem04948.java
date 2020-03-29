package com.tistory.aerotic;

import java.util.Scanner;

public class Problem04948 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n;
    int count;

    while (scan.hasNext()) {
      n = scan.nextInt();
      count = 0;
      if (n == 0) {
        break;
      }

      int[] arr = new int[2 * n + 1];

      for (int i = 2; i < 2 * n + 1; i++) {
        if (arr[i] == 0) {
          inner: for (int j = 1;; j++) {
            int save = i + i * j;
            if (save > 2 * n) {
              break inner;
            }
            arr[save] = 1;
          }
        }
      }

      for (int i = n + 1; i <= 2 * n; i++) {
        if (arr[i] == 0) {
          count++;
        }
      }

      System.out.println(count);
    }
  }

}

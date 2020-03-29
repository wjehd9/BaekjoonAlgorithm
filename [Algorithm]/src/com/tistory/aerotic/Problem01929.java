package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01929 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int m, n;
    m = scan.nextInt();
    n = scan.nextInt();

    int[] arr = new int[n + 1];

    for (int i = 2; i < n + 1; i++) {
      if (arr[i] == 0) {
        if (i * i > 1000000) {
          break;
        } else {
          for (int j = i * i; j < n + 1; j = j + i) {
            arr[j] = 1;
          }
        }
      }
    }

    for (int i = m; i <= n; i++) {
      // 1보다 크면서 소수인 숫자를 출력한다.
      if (arr[i] == 0 && i != 1) {
        System.out.println(i);
      }
    }

    scan.close();
  }

}

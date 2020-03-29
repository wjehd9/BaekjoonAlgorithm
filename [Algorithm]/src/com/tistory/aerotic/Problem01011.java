package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01011 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int t = scan.nextInt();

    // 우주선과 행성의 위치를 정의
    int x, y;

    // 둘 사이의 거리에 대한 횟수 정의
    long[] dist = new long[t];

    for (int i = 0; i < t; i++) {
      x = scan.nextInt();
      y = scan.nextInt();

      dist[i] = dp(y - x);
    }

    for (int i = 0; i < t; i++) {
      System.out.println(dist[i]);
    }

    scan.close();
  }

  // 둘 사이의 거리를 이용하여 DP과정을 진행
  static long dp(int n) {
    long count = 1;
    long k;
    for (;; count++) {
      if (count * count > n) {
        break;
      }
    }

    // count의 제곱이 n을 초과시켰으므로 k를 구하기 위해서는 count-- 과정을 수행해야 한다.
    count--;
    k = n - count * count;

    k = (long) Math.ceil((double) k / (double) count);

    return 2 * count - 1 + k;
  }
}

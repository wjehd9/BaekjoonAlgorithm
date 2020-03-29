package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10870 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    System.out.println(fibo2(n));

    scan.close();
  }

  static int fibo2(int k) {
    int[] answer = new int[k + 1];

    if (k == 0) {
      return 0;
    } else if (k == 1) {
      return 1;
    } else {
      answer[0] = 0;
      answer[1] = 1;
      for (int i = 2; i <= k; i++) {
        answer[i] = answer[i - 1] + answer[i - 2];
      }
      return answer[k];
    }
  }

}

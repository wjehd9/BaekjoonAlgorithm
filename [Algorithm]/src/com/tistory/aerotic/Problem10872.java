package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10872 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    System.out.println(factorial(n));

    scan.close();
  }

  static long factorial(int n) {
    long answer = 1;
    if (n == 0) {
      return 1;
    } else {
      for (int i = 1; i <= n; i++) {
        answer = i * factorial(i - 1);
      }
      return answer;
    }
  }

}

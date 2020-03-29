package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10950 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] result = new int[n];

    int a, b;

    for (int i = 0; i < n; i++) {
      a = scan.nextInt();
      b = scan.nextInt();

      result[i] = a + b;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(result[i]);
    }
  }

}

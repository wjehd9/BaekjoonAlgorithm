package com.tistory.aerotic;

import java.util.Scanner;

public class Problem11022 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + (a[i] + b[i]));
    }


    scan.close();
  }

}

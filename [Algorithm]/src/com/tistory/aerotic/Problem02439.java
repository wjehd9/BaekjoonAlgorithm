package com.tistory.aerotic;

import java.util.Scanner;

public class Problem02439 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    scan.close();
  }

}

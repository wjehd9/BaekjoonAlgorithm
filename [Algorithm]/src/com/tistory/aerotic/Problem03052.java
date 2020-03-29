package com.tistory.aerotic;

import java.util.Scanner;

public class Problem03052 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int[] n = new int[10];
    int[] check = new int[42];
    int count = 0;

    for (int i = 0; i < 10; i++) {
      n[i] = scan.nextInt();
      check[n[i] % 42]++;
    }

    for (int i = 0; i < 42; i++) {
      if (check[i] != 0) {
        count++;
      }
    }

    System.out.println(count);

    scan.close();
  }

}

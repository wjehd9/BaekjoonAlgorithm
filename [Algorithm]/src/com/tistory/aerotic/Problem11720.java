package com.tistory.aerotic;

import java.util.Scanner;

public class Problem11720 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] temp = new int[n];

    String s = scan.next();

    for (int i = 0; i < n; i++) {
      temp[i] = Integer.parseInt(String.format("%c", s.charAt(i)));
    }

    int total = 0;

    for (int i = 0; i < n; i++) {
      total += temp[i];
    }

    System.out.println(total);

    scan.close();
  }

}

package com.tistory.aerotic;

import java.util.Scanner;

public class problem10818 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }

    int min = a[0];
    int max = a[0];

    for (int i = 0; i < n; i++) {
      if (a[i] < min) {
        min = a[i];
      }
      if (a[i] > max) {
        max = a[i];
      }
    }

    System.out.println(min + " " + max);
  }

}

package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10817 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int[] num = new int[3];
    for (int i = 0; i < 3; i++) {
      num[i] = scan.nextInt();
    }
    num = sort(num);
    System.out.print(num[1]);
  }

  public static int[] sort(int[] n) {
    int temp;
    for (int i = 0; i < n.length - 1; i++) {
      for (int j = 0; j < n.length - 1; j++) {
        if (n[j] > n[j + 1]) {
          temp = n[j];
          n[j] = n[j + 1];
          n[j + 1] = temp;
        }
      }
    }

    return n;
  }

}

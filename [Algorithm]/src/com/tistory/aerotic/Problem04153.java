package com.tistory.aerotic;

import java.util.Arrays;
import java.util.Scanner;

public class Problem04153 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int[] num = new int[3];

    while (scan.hasNext()) {
      num[0] = scan.nextInt();
      num[1] = scan.nextInt();
      num[2] = scan.nextInt();

      if (num[0] == 0) {
        break;
      }

      Arrays.sort(num);

      if (Math.pow(num[0], 2) + Math.pow(num[1], 2) == Math.pow(num[2], 2)) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }

}

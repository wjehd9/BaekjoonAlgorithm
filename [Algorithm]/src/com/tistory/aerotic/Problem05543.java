package com.tistory.aerotic;

import java.util.Scanner;

public class Problem05543 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int min = 99999;

    int[] price = new int[5];

    for (int i = 0; i < 5; i++) {
      price[i] = scan.nextInt();
    }

    for (int x = 0; x < 3; x++) {
      for (int y = 3; y < 5; y++) {
        if (price[x] + price[y] - 50 < min) {
          min = price[x] + price[y] - 50;
        }
      }
    }

    System.out.println(min);
  }

}

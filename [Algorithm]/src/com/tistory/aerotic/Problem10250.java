package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10250 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int t, h, w, n;

    t = scan.nextInt();

    int x, y;
    String[] room = new String[t];

    for (int i = 0; i < t; i++) {
      h = scan.nextInt();
      w = scan.nextInt();
      n = scan.nextInt();

      x = n / h;
      y = n % h;
      if (y == 0) {
        y = h;
      } else {
        x++;
      }

      if (x < 10) {
        room[i] = Integer.toString(y) + Integer.toString(0) + Integer.toString(x);
      } else {
        room[i] = Integer.toString(y) + Integer.toString(x);
      }

    }

    for (int i = 0; i < t; i++) {
      System.out.println(room[i]);
    }
  }

}

package com.tistory.aerotic;

import java.util.Scanner;

public class Problem05622 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();
    int time = 0;

    for (int i = 0, k = s.length(); i < k; i++) {
      if (s.charAt(i) < 80) {
        time += (s.charAt(i) - 56) / 3;
      } else if (s.charAt(i) < 84) {
        time += 8;
      } else if (s.charAt(i) < 89) {
        time += (s.charAt(i) - 57) / 3;
      } else {
        time += 10;
      }
    }

    System.out.println(time);

    scan.close();
  }

}

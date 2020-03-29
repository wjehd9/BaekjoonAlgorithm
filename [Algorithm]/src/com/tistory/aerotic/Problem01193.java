package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01193 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    cal(n);

    scan.close();
  }

  private static void cal(int n) {
    int x = 0, y = 0;
    int total = 0;
    int last = 0;
    int line_num = 0;
    int line_sum = 0;

    if (n == 1) {
      System.out.println("1/1");
    } else {
      while (n > total) {
        last += line_num;
        line_num++;
        total += line_num;
      }

      line_sum = line_num + 1;

      for (int i = 1; i <= line_num; i++) {
        if (last + i == n) {
          if (line_num % 2 == 0) {
            x = i;
            y = line_sum - x;
          } else {
            y = i;
            x = line_sum - y;
          }
        }
      }
      System.out.println(x + "/" + y);
    }
  }

}

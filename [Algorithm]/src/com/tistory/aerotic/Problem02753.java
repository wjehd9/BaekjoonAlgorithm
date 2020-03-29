package com.tistory.aerotic;

import java.util.Scanner;

public class Problem02753 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();

    if (a % 4 == 0) {
      // 4의 배수일 떄 윤년 판정 위함
      if (a % 400 == 0) {
        // 400의 배수일 때 윤년
        System.out.println("1");
      } else if (a % 100 == 0) {
        // 400의 배수가 아니지만 100의 배수이면 윤년이 아니다.
        System.out.println("0");
      } else {
        // 100, 400의 배수가 아닌 4의 배수일 때는 윤년이다.
        System.out.println("1");
      }
    } else {
      // 4의 배수가 아닐 때는 윤년이 아니다.
      System.out.println("0");
    }

    scan.close();
  }

}

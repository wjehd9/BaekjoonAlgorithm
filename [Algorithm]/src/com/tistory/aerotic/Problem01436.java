package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01436 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int number = 1;
    int count = 0;

    String text = "666";

    while (true) {
      // 숫자가 666을 포함하는지 확인
      // contain 함수를 사용하기 위해 숫자를 문자로 변환시킨다.
      if (Integer.toString(number).contains(text)) {
        count++;
      }

      // 원하는 회차의 값이 666을 포함한 숫자의 개수와 일치할 때 while문을 종료시킨다.
      if (count == n) {
        break;
      }

      // while문을 진행하기 위해 숫자를 1씩 늘린다.
      number++;
    }

    // 결과를 출력한다.
    System.out.println(number);

    scan.close();
  }

}

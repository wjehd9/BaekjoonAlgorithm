package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01152 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    int count = 0;

    // 공백 문자의 여부를 나타내는 변수이고, 처음에는 false상태로 가정
    boolean check = false;

    for (int i = 0, k = s.length(); i < k; i++) {
      if (s.charAt(i) == 32) {
        // 공백 문자가 입력되면 false
        check = false;
      } else {
        // 공백 문자가 아닌 경우
        if (check == false) {
          // 바로 앞에 공백 문자였으면 true상태로 변환시킨다.
          check = true;

          // 그리고 단어의 개수를 1개 늘려나간다.
          count++;
        }
      }
    }

    System.out.println(count);

    scan.close();
  }

}

package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01316 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int count = 0;

    for (int i = 0; i < n; i++) {
      String line = scan.next();

      count = count + check(line);
    }

    System.out.println(count);

    scan.close();
  }

  private static int check(String s) {
    int k = s.length();

    // 알파벳의 인덱스를 저장하기 위한 배열 생성
    int[] site = new int[26];

    // 초기에는 알파벳이 없으므로 배열의 값을 모두 -1로 지정한다.
    for (int i = 0; i < 26; i++) {
      site[i] = -1;
    }

    for (int i = 0; i < k; i++) {
      // 알파벳이 처음 나오거나 비교 대상의 알파벳이 이전의 값과 같은 경우
      if (site[s.charAt(i) - 97] == -1 || i - site[s.charAt(i) - 97] == 1) {
        // 배열에 해당 알파벳의 위치를 저장한다.
        site[s.charAt(i) - 97] = i;
      } else {
        // 만약 위의 경우에 해당되지 않고, 같은 알파벳이 연속되지 않게 떨어져서 나올 경우
        if (i - site[s.charAt(i) - 97] > 1) {
          // 개수를 0으로 반환
          return 0;
        }
      }
    }
    // 개수를 1으로 반환
    return 1;

  }

}

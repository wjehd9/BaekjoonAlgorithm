package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01065 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    // 입력받는 자연수의 범위가 1~1000이므로 1001개의 칸을 가진 배열을 생성한다.
    int[] num = new int[1001];
    int count = 0;

    for (int i = 1; i <= n; i++) {
      // 각 숫자마다 배열의 칸을 1개씩 할당한다.
      num[i] = cal(i);

      // 반환 값이 1이면 개수를 1씩 늘린다.
      if (num[i] == 1) {
        count++;
      }
    }

    System.out.println(count);

    scan.close();
  }

  static int cal(int k) {
    int[] a = new int[4];
    int number = k;
    int count = 0;

    // 입력된 인자의 자리수에 있는 값들을 배열에 저장시킨다.
    while (k > 0) {
      a[count] = k % 10;
      k /= 10;
      count++;
    }

    if (number < 100) {
      // 입력된 인자의 값이 100미만인 경우에는 1을 반환
      return 1;
    } else if (number < 1000) {
      int m = a[0] - a[1];
      int n = a[1] - a[2];

      // 각 자리의 숫자가 등차수열을 성립하는지 확인
      if (m == n) {
        // 성립하면 1을 반환
        return 1;
      } else {
        // 성립하지 않으면 0을 반환
        return 0;
      }
    } else {
      // 입력된 인자의 값이 1000인 경우는 성립하지 않으므로 0을 반환
      return 0;
    }
  }

}

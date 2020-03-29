package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01110 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int x, n = 0, save;
    x = scan.nextInt();

    // 초기 값을 저장시켜주는 변수를 생성
    save = x;

    // a는 10의 자리, b는 1의 자리 숫자를 의미
    int a, b;

    // 사이클이 완료될 때까지 무한으로 지속되게 한다.
    while (true) {
      if (x < 10) {
        a = 0;
        b = x;
        n++;
      } else {
        a = x / 10;
        b = x % 10;
        n++;
      }

      // 사이클 과정을 수행
      x = 10 * b + ((a + b) % 10);

      // 저장된 값과 사이클 과정을 통해 얻은 값이 일치하면 반복문을 중단한다.
      if (save == x) {
        break;
      }
    }

    System.out.println(n);

    scan.close();
  }

}

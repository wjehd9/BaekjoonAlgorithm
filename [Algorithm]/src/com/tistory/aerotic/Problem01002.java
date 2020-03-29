package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01002 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    // 테스트의 개수
    int t = scan.nextInt();

    int x1, y1, r1, x2, y2, r2;
    double dist;

    for (int i = 0; i < t; i++) {
      // 조규현의 좌표
      x1 = scan.nextInt();
      y1 = scan.nextInt();

      // 조규현과 류재명과의 거리
      r1 = scan.nextInt();

      // 백승환의 좌표
      x2 = scan.nextInt();
      y2 = scan.nextInt();

      // 백승환과 류재명과의 거리
      r2 = scan.nextInt();

      // 피타고라스 정리를 이용하여 조규현과 백승환 사이의 거리를 구한다.
      dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

      // 경우를 나타내기 위한 변수
      int n = 0;

      // 둘의 반지름 합이 거리보다 작은 경우 = 접점 : 0개
      if (r1 + r2 < dist) {
        n = 1;
      }
      // 둘의 반지름 합과 거리가 같은 경우 = 접점 : 1개
      if (r1 + r2 == dist) {
        n = 2;
      }
      // 둘의 반지름 합이 거리보다 큰 경우 = 접점 : 2개
      if (r1 + r2 > dist) {
        n = 3;
      }
      // 어느 작은 원이 큰 원의 내부에 속해 있으면서 접점이 하나인 경우 = 접점 : 1개
      if (Math.abs(r1 - r2) == dist) {
        n = 4;
      }
      // 어느 작은 원이 큰 원의 내부에 속해 있으면서 접점이 없는 경우 = 접점 : 0개
      if (Math.abs(r1 - r2) > dist) {
        n = 5;
      }
      // 조규현과 백승환이 서로 같은 경우 = 접점 : 무한개
      if (x1 == x2 && y1 == y2 && r1 == r2) {
        n = 6;
      }

      switch (n) {
        case 1:
          System.out.println(0);
          break;
        case 2:
          System.out.println(1);
          break;
        case 3:
          System.out.println(2);
          break;
        case 4:
          System.out.println(1);
          break;
        case 5:
          System.out.println(0);
          break;
        case 6:
          System.out.println(-1);
          break;
      }
    }

    scan.close();
  }

}

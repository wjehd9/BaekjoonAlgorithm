package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01018 {

  // 맨 왼쪽 위가 White일 때의 배열을 정의
  static char[][] white =
      {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}};

  // 맨 왼쪽 위가 Black일 때의 배열을 정의
  static char[][] black =
      {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n, m;

    n = scan.nextInt();
    m = scan.nextInt();

    char[][] board = new char[n][m];

    for (int i = 0; i < n; i++) {
      String s = scan.next();

      for (int j = 0; j < m; j++) {
        board[i][j] = s.charAt(j);
      }
    }

    int min = 9999999;
    int count1, count2;

    // 8칸씩 묶어서 비교를 하기 위해서 i+7을 이용
    for (int i = 0; i + 7 < n; i++) {
      for (int j = 0; j + 7 < m; j++) {
        count1 = 0;
        count2 = 0;

        // 8칸씩 묶인 배열 값들과 초기 정의한 white의 값을 비교
        for (int y = i; y < i + 8; y++) {
          for (int x = j; x < j + 8; x++) {
            // 일치하지 않으면 카운트 증가
            if (board[y][x] != white[y - i][x - j]) {
              count1++;
            }
          }
        }

        // 8칸씩 묶인 배열 값들과 초기 정의한 black의 값을 비교
        for (int y = i; y < i + 8; y++) {
          for (int x = j; x < j + 8; x++) {
            // 일치하지 않으면 카운트 증가
            if (board[y][x] != black[y - i][x - j]) {
              count2++;
            }
          }
        }

        if (count1 < min) {
          min = count1;
        }

        if (count2 < min) {
          min = count2;
        }

      }
    }

    // white와 black 방식으로 비교했을 때의 최소 경우의 값을 나타낸다.
    System.out.println(min);

    scan.close();
  }

}

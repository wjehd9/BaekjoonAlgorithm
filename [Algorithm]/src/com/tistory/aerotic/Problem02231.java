package com.tistory.aerotic;

import java.util.Scanner;

public class Problem02231 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] num = new int[6];

    int sum;
    boolean check = false;

    outer: for (num[5] = 0; num[5] < 10; num[5]++) {
      for (num[4] = 0; num[4] < 10; num[4]++) {
        for (num[3] = 0; num[3] < 10; num[3]++) {
          for (num[2] = 0; num[2] < 10; num[2]++) {
            for (num[1] = 0; num[1] < 10; num[1]++) {
              for (num[0] = 0; num[0] < 10; num[0]++) {
                sum = 0;
                for (int i = 5; i >= 0; i--) {
                  sum += (Math.pow(10, i) + 1) * num[i];
                  if (sum == n) {
                    check = true;
                    break outer;
                  }
                }
              }
            }
          }
        }
      }
    }

    int answer = 0;

    if (check) {
      for (int i = 5; i >= 0; i--) {
        answer += Math.pow(10, i) * num[i];
      }
    } else {
      answer = 0;
    }

    System.out.println(answer);
  }

}

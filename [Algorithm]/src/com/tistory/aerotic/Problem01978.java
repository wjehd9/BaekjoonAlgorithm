package com.tistory.aerotic;

import java.util.Scanner;

public class Problem01978 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int number;

    int count = 0, save, temp;

    for (int i = 0; i < n; i++) {
      number = scan.nextInt();
      save = number;
      temp = 2;
      while (number >= 1) {
        if (number == 1) {
          break;
        }
        if (save == temp) {
          count++;
        }
        if (number % temp == 0) {
          number /= temp;
        } else {
          temp++;
        }
      }
    }

    System.out.println(count);

    scan.close();
  }

}

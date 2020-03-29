package com.tistory.aerotic;

import java.util.Scanner;

public class Problem09498 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();

    int n = a / 10;

    switch (n) {
      case 10:
        System.out.println("A");
        break;
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    scan.close();
  }

}

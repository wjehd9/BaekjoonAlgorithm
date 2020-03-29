package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10869 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int a, b;

    a = scan.nextInt();
    b = scan.nextInt();

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    scan.close();
  }

}

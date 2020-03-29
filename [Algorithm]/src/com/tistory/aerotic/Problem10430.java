package com.tistory.aerotic;

import java.util.Scanner;

public class Problem10430 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int a, b, c;

    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();

    System.out.println((a + b) % c);
    System.out.println((a % c + b % c) % c);
    System.out.println((a * b) % c);
    System.out.println((a % c * b % c) % c);

    scan.close();
  }

}

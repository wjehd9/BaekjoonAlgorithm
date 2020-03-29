package com.tistory.aerotic;

import java.util.Scanner;

public class Problem02941 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine().trim();
    int answer = 0;

    String[] txt = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    for (int i = 0, k = txt.length; i < k; i++) {
      if (s.contains(txt[i])) {
        s = s.replaceAll(txt[i], "*");
      }
    }

    answer = s.length();

    System.out.println(answer);

    scan.close();

  }



}

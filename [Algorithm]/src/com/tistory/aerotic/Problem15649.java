package com.tistory.aerotic;

import java.util.Scanner;

public class Problem15649 {

  static int[] arr;
  static int number = 1;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    int n, m;

    n = scan.nextInt();
    m = scan.nextInt();

    for (int i = 0; i < m; i++) {
      number *= n - i;
    }

    arr = new int[m];

    save(n, m, arr, 0, 0);

    scan.close();
  }

  static void save(int n, int m, int[] arr, int count, int before) {
    if (count == m) {
      for (int i = 0; i < m; i++) {
        for (int k = i + 1; k < m; k++) {
          if (arr[i] == arr[k]) {
            return;
          }
        }
      }

      number--;
      for (int i = 0; i < m; i++) {
        System.out.print(arr[i] + " ");
      }
      if (number > 0) {
        System.out.println("");
      }
      return;
    }

    for (int i = 1; i <= n; i++) {
      if (i != before) {
        arr[count] = i;
        save(n, m, arr, count + 1, i);
      }
    }
  }

}

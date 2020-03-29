package com.tistory.aerotic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem15651 {

  static int[] arr;
  static BufferedWriter bw;
  static int number = 1;

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n, m;

    n = scan.nextInt();
    m = scan.nextInt();

    for (int i = 0; i < m; i++) {
      number *= n;
    }

    arr = new int[m];

    save(n, m, arr, 0);

    bw.close();

    scan.close();
  }

  static void save(int n, int m, int[] arr, int count) throws IOException {
    if (count == m) {
      number--;
      for (int i = 0; i < m; i++) {
        bw.write(arr[i] + " ");
      }

      if (number > 0) {
        bw.write("\n");
      }
      bw.flush();

      return;
    }

    for (int i = 1; i <= n; i++) {
      arr[count] = i;
      save(n, m, arr, count + 1);
    }
  }

}

package com.tistory.aerotic;

public class Problem04673 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] temp = new int[10001];
    temp[0] = 1;

    for (int i = 1; i < 10001; i++) {
      int total = d(i);
      if (total <= 10000) {
        temp[total] = 1;
      }
    }

    for (int i = 1; i < 10001; i++) {
      if (temp[i] != 1) {
        System.out.println(i);
      }
    }

  }

  static int d(int n) {

    int total = n;

    while (n > 0) {
      total += n % 10;
      n /= 10;
    }

    return total;

  }
}

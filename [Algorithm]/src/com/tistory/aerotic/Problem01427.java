package com.tistory.aerotic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem01427 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);

    long n = scan.nextLong();

    ArrayList<Integer> arr = new ArrayList<Integer>();

    // 입력받은 숫자를 자리수별로 배열에 저장하기 위한 과정을 수행
    while (n > 0) {
      arr.add((int) (n % 10));
      n /= 10;
    }

    Collections.sort(arr, new MyComparator01427());

    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i));
    }

    scan.close();
  }

}


class MyComparator01427 implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    // TODO Auto-generated method stub
    if (o1 > o2) {
      return -1;
    } else {
      return 1;
    }
  }

}

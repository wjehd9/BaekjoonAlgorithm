package com.tistory.aerotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10989 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] num = new int[10001];

    for (int i = 0; i < n; i++) {
      num[Integer.parseInt(br.readLine())]++;
    }

    for (int i = 0; i < 10001; i++) {
      if (num[i] > 0) {
        for (int j = 0; j < num[i]; j++) {
          bw.write(i + "\n");
        }
      }
    }

    bw.close();
    br.close();
  }

}

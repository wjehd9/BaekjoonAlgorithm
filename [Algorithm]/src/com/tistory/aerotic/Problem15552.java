package com.tistory.aerotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15552 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int n = Integer.parseInt(s);
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      s = br.readLine();
      a[i] = Integer.parseInt(s.split(" ")[0]);
      b[i] = Integer.parseInt(s.split(" ")[1]);
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int i = 0; i < n; i++) {
      bw.write((a[i] + b[i]) + "\n");
    }
    bw.flush();
    bw.close();
  }

}

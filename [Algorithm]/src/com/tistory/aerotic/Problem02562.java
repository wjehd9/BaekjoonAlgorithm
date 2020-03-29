package com.tistory.aerotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem02562 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] n = new int[9];
    int index = 0, max = 0;
    for (int i = 0; i < 9; i++) {
      String s = br.readLine();
      n[i] = Integer.parseInt(s);

      if (n[i] > max) {
        max = n[i];
        index = i + 1;
      }
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(max + "\n");
    bw.write(index + "\n");
    bw.flush();
    bw.close();
  }

}

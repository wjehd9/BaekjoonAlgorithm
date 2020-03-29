package com.tistory.aerotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem02675 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    // Scanner scan = new Scanner(System.in);
    //
    // int n = scan.nextInt();
    // int[] count = new int[n];
    // String[] s = new String[n];
    //
    // for (int i = 0; i < n; i++) {
    // count[i] = scan.nextInt();
    // s[i] = scan.next();
    // }
    //
    // for (int i = 0; i < n; i++) {
    // for (int j = 0, k = count[i]; j < k; j++) {
    // for (int m = 0; m < k; m++) {
    // System.out.print(s[i].charAt(j));
    // }
    // }
    // System.out.println();
    // }
    //
    // scan.close();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String temp = br.readLine();

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(temp);

    String[] line = new String[n];
    String[][] site = new String[n][2];

    for (int i = 0; i < n; i++) {
      line[i] = br.readLine();
      site[i][0] = line[i].split(" ")[0];
      site[i][1] = line[i].split(" ")[1];
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0, x = site[i][1].length(); j < x; j++) {
        for (int m = 0, k = Integer.parseInt(site[i][0]); m < k; m++) {
          bw.write(site[i][1].charAt(j));
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();

  }

}

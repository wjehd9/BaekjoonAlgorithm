package com.tistory.aerotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem01157 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();

    // 입력받은 단어의 모든 알파벳을 대문자로 바꾼다.
    s = s.toUpperCase();

    // 알파벳의 개수만큼 배열을 만든다.
    int[] spell = new int[26];
    int max = 0;
    char result = '?';

    for (int i = 0, m = s.length(); i < m; i++) {
      // 단어의 i번째 위치에 있는 알파벳을 아스키 코드로 바꾼다.
      int up = s.charAt(i);
      spell[up - 65]++;
      if (max < spell[up - 65]) {
        max = spell[up - 65];
        // 가장 많이 사용된 알파벳을 결과로 만든다.
        result = s.charAt(i);
      } else if (max == spell[up - 65]) {
        // 가장 많이 사용된 알파벳이 여러 개일 경우 결과를 ?로 만든다.
        result = '?';
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

}

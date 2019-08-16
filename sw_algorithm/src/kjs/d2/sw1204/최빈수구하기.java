package kjs.d2.sw1204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer stk = null;
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine()), tc = 0;
		while(tc++ < t) {
			int n = Integer.parseInt(br.readLine()), maxScore = 0, maxCnt = 0;
			stk = new StringTokenizer(br.readLine());
			int[] score = new int[101];
			while(stk.hasMoreTokens()) score[Integer.parseInt(stk.nextToken())] += 1;
			for(int i=0; i<score.length; i++) {
				if(score[i] >= maxCnt) {
					maxCnt = score[i];
					maxScore = i;
				}
			}
			System.out.printf("#%d %d\n", n, maxScore);
		}
	}
}
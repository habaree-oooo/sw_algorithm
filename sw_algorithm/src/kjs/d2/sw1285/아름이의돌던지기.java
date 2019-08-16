package kjs.d2.sw1285;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 아름이의돌던지기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = null;
		int tc = Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int n = Integer.parseInt(br.readLine());
			stk = new StringTokenizer(br.readLine());
			int min = 100000, cnt=0;
			for(int i=0; i<n; i++) {
				int num = Math.abs(Integer.parseInt(stk.nextToken()));
				if(num <= min) {
					if(num == min) cnt++;
					else cnt=1;
					min = num;
				}
			}
			System.out.printf("#%d %d %d\n", t, min, cnt);
		}
	}
}

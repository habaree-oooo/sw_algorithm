package kjs.d2.sw1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가랏RC카 {
	static int[] speed = {0, +1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int m = 0, s = 0;
			for(int i=0; i<n; i++) {
				String[] str = br.readLine().split(" ");
				int c = Integer.parseInt(str[0]);
				if(c!=0){
					int a = Integer.parseInt(str[1]);
					if(c == 2 && s < a) s = 0;
					else s += speed[c]*a;
				}
				m += s;
			}
			System.out.printf("#%d %d\n", tc, m);
		}
	}
}

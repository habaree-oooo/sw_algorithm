package kjs.d2.sw1284;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수도요금경쟁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), tc=0;
		while(tc++<t) {
			String[] st = br.readLine().split(" ");
			int p = Integer.parseInt(st[0]);
			int q = Integer.parseInt(st[1]);
			int r = Integer.parseInt(st[2]);
			int s = Integer.parseInt(st[3]);
			int w = Integer.parseInt(st[4]);
			int typeA = p * w;
			int typeB = 0;
			if(w <= r) typeB = q;
			else typeB = q + (w-r)*s;
			System.out.printf("#%d %d\n", tc, typeA<=typeB?typeA:typeB);
		}
	}
}

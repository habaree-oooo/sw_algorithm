package kjs.d2.sw1945;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한소인수분해 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] snum = {2, 3, 5, 7, 11};
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] scnt = {0, 0, 0, 0, 0};
			while(n!=1) {
				for(int i=0; i<snum.length; i++) {
					if(n%snum[i]==0) {
						n = n/snum[i];
						scnt[i]++;
						break;
					}
				}
			}
			System.out.printf("#%d", tc);
			for(int i=0; i<scnt.length; i++)
				System.out.printf(" %d", scnt[i]);
			System.out.println();
		}
	}
}

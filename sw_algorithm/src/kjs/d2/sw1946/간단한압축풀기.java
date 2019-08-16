package kjs.d2.sw1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 간단한압축풀기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			String[] ci = new String[n];
			int[] ki = new int[n];
			int cnt = 0;
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				ci[i] = st.nextToken();
				ki[i] = Integer.parseInt(st.nextToken());
			}
			System.out.printf("#%d\n", tc);
			for(int i=0; i<ki.length; i++) {
				for(int j=0; j<ki[i]; j++) {
					cnt++;
					System.out.printf("%s", ci[i]);
					if(cnt == 10) {
						System.out.println();
						cnt = 0;
					}
				}
			}
			System.out.println();
		}
	}
}
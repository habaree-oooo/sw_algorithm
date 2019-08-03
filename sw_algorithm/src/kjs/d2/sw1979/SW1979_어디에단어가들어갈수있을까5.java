package kjs.d2.sw1979;

import java.util.Scanner;

public class SW1979_어디에단어가들어갈수있을까5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] map = new int[N][N];
			int sum = 0;
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
					cnt = (cnt + 1) * map[i][j];
					if(cnt == K) sum++;
					if(cnt > K) {
						sum--;
						cnt = 0;
					}
				}
			}
			for(int i=0; i<N; i++) {
				int cnt = 0;
				for(int j=0; j<N; j++) {
					cnt = (cnt + 1) * map[j][i];
					if(cnt == K) sum++;
					if(cnt > K) {
						sum--;
						cnt = 0;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
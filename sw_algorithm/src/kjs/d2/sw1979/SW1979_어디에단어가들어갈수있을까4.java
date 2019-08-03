package kjs.d2.sw1979;

import java.util.Scanner;

/**
 * 
 * @author ck
 * 짧은 정답
 *
 */
public class SW1979_어디에단어가들어갈수있을까4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			int c = 0;
			int n = 0;
			for (int i = 0; i < N; i++) {
				c = 0;
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
					if (arr[i][j] == 1) c++;
					else c = 0;
					if (c == K) n++;
					if (c > K) {
						n--;
						c = 0;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				c = 0;
				for (int j = 0; j < N; j++) {
					if (arr[j][i] == 1) c++;
					else c = 0;
					if (c == K) n++;
					if (c > K) {
						n--;
						c = 0;
					}
				}
			}
			System.out.println("#" + t + " " + n);
		}
	}
}
//https://blog.naver.com/godori91/221339331087
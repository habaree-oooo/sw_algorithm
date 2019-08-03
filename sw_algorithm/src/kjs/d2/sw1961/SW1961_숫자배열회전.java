package kjs.d2.sw1961;

import java.util.Scanner;

public class SW1961_숫자배열회전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[][] map1 = new int[N][N];
			int[][] map2 = new int[N][N];
			int[][] map3 = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					int input = sc.nextInt();
					map1[j][(N-1)-i] = input;
					map2[(N-1)-i][(N-1)-j] = input;
					map3[(N-1)-j][i] = input;
				}
			}
			System.out.printf("#%d\n", tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++)
					System.out.print(map1[i][j]);
				System.out.print(" ");
				for(int j=0; j<N; j++)
					System.out.print(map2[i][j]);
				System.out.print(" ");
				for(int j=0; j<N; j++)
					System.out.print(map3[i][j]);
				System.out.print("\n");
			}
		}
	}
}
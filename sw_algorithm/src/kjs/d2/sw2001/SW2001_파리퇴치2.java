package kjs.d2.sw2001;

import java.util.Scanner;

public class SW2001_파리퇴치2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn = 1; tcn<T; tcn++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][]map = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
		}
	}
}

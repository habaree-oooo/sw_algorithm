package kjs.d2.sw2005;

import java.util.Scanner;

public class SW2005_파스칼삼각형2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 1
		for (int tcn = 1; tcn <= T; tcn++) {
			int N = sc.nextInt(); // 4

			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][0] = 1;
				}
			}
			System.out.println("#" + tcn);
			for (int i = 1; i < N; i++) {
				for (int j = 1; j < N; j++) {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 0)
						continue;
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		} // for
	}// main
}

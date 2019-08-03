package kjs.d2.sw1979;

import java.util.Scanner;

/**
 * @author ck
 * 하샘코드
 */
public class SW1979_어디에단어가들어갈수있을까3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt(); // 5
			int K = sc.nextInt(); // 3
			int[][] arr = new int[N][N];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			} // fill map

			int allLine = 0;
			for (int ir = 0; ir < N; ir++) {
				for (int ic = 0; ic < N; ic++) {
					if (arr[ir][ic] == 1) {
						int cnt = check(arr, ir, ic, K); // 0,2,3
						allLine += cnt;
						ic = N;// 안의 for를 안돌게
					}
				}
				System.out.println();
			}
			System.out.println("#" + t + " " + allLine);
		}
	}

	private static int check(int[][] arr, int ir, int ic, int k) { // 0,2,3
		int[] result = new int[5];
		int count = 0;
		if (ic == arr.length - k) {
			for (int dc = 0; dc < k; dc++) {
				int col = ic + dc;
				if (col >= 0 && col < arr.length && arr[ir][col] == 1) {
					result[dc] = 1;
				}
			}
			if (result[0] == 1 && result[1] == 1 && result[2] == 1 && result[3] != 1)
				count = 1;
		} else {
			for (int dc = 0; dc <= k; dc++) {
				int col = ic + dc;
				if (col >= 0 && col < arr.length && arr[ir][col] == 1) {
					if (arr[ir][ic + k] == 1)
						result[dc] = 0;

					result[dc] = 1;
				}
			}
			if (result[0] == 1 && result[1] == 1 && result[2] == 1 && result[3] != 1)
				count = 1;
		}

		return count;
	}
}

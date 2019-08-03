package kjs.d2.sw1974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1974_스도쿠검증_가장빠른코드 {
	public static int[][] mMap;
	public static int mResult = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for (int t = 1; t <= T; t++) {
			mMap = new int[9][9];
			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 9; j++) {
					mMap[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			boolean[][] checkRC = new boolean[10][10];
			for (int i = 0; i < 9; i++) {
				boolean[] checkR = new boolean[10];
				boolean[] checkC = new boolean[10];
				for (int j = 0; j < 9; j++) {
					if (!checkR[mMap[i][j]]) {
						checkR[mMap[i][j]] = true;
					} else {
						mResult = 0;
						break;
					}
				}
				if (mResult == 0) {
					break;
				}
				for (int j = 0; j < 9; j++) {
					if (!checkC[mMap[j][i]]) {
						checkC[mMap[j][i]] = true;
					} else {
						mResult = 0;
						break;
					}
				}
				if (mResult == 0) {
					break;
				}
				for (int j = 0; j < 9; j++) {
					int R = (i / 3) * 3 + j / 3;
					if (!checkRC[R][mMap[i][j]]) {
						checkRC[R][mMap[i][j]] = true;
					} else {
						mResult = 0;
						break;
					}
				}
				if (mResult == 0) {
					break;
				}
			}
			System.out.println("#" + t + " " + mResult);
			mResult = 1;
		}
	}
}
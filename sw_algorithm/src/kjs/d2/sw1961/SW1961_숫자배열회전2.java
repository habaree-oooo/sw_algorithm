package kjs.d2.sw1961;

import java.util.Scanner;

public class SW1961_숫자배열회전2 {
	static Scanner sc = new Scanner(System.in);
	static int[][] map = null;
	static int N = 0;
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++)
					map[i][j] = sc.nextInt();
			int[][] map1 = lotateMap(map);
			int[][] map2 = lotateMap(map1);
			int[][] map3 = lotateMap(map2);
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
	public static int[][] lotateMap(int[][] map) {
		int[][] result = new int[map.length][map.length];
		int k = map.length-1;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				result[j][k] = map[i][j];
			}
			k--;
		}
		return result;
	}	
}
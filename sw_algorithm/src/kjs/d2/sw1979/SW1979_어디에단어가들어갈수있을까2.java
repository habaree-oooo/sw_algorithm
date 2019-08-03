package kjs.d2.sw1979;

import java.util.Scanner;

public class SW1979_어디에단어가들어갈수있을까2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트의 수
		int[] result = new int[T];
		for(int a=0; a<T; a++) {
			int N = sc.nextInt(); //정사각형의 크기
			int K = sc.nextInt(); //찾는 단어 크기
			int[][] arr = new int[N][N];
			for(int b=0; b<N; b++) //입력
				for(int c=0; c<N; c++)
					arr[b][c] = sc.nextInt();
			result[a] = getCnt(N, K, arr, true) + getCnt(N, K, arr, false);
		}
		for(int a=0; a<T; a++) {
			System.out.printf("#%d %d\n", a+1, result[a]);
		}
	}
	public static int getCnt(int N, int K, int[][] arr, boolean isSero) {
		int searchCnt = 0;
		for(int b=0; b<N; b++) {
			int cnt = 0;
			for(int c=0; c<N; c++) {
				if(isSero) {
					if(cnt == K && arr[b][c] == 0) {
						searchCnt++;
						cnt = 0;
					}
					if(arr[b][c] == 1) cnt++;
				}else{
					if(cnt == K && arr[c][b] == 0) {
						searchCnt++;
						cnt = 0;
					}
					if(arr[c][b] == 1) cnt++;
				}
				if(cnt == K) {
					searchCnt++;
					cnt = 0;
				}
			}
		}
		return searchCnt;
	}
}
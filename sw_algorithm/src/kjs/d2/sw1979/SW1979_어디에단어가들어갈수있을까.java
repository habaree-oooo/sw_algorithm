package kjs.d2.sw1979;

import java.util.Scanner;

public class SW1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트횟수
		int[] output = new int[T]; //출력값
		for(int a=0; a<T; a++) {
			int N = sc.nextInt(); //배열 가로,세로 크기
			int K = sc.nextInt(); //단어 길이
			int[][] arry = new int[N][N];
			for(int i=0; i<N; i++) //배열값 입력.
				for(int j=0; j<N; j++)
					arry[i][j] = sc.nextInt();
			output[a] = getCnt(N, K, arry, false) + getCnt(N, K, arry, true);
		}
		for(int i=0; i<T; i++) System.out.printf("#%d %d\n", i+1, output[i]);
	}
	public static int getCnt(int N, int K, int[][] arry, boolean isSero) {
		int total = 0 ;
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=0; j<N; j++) {
				if(isSero) { // 세로 일때
					if(cnt == K && 0 == arry[j][i]) total++;
					cnt = (cnt+1) * arry[j][i];
				}else { // 가로 일때
					if(cnt == K && 0 == arry[i][j]) total++;
					cnt = (cnt+1) * arry[i][j];
				}
			}
			if(cnt == K) total++;
		}
		return total;
	}
}
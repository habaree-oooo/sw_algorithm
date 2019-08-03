package kjs.d2.sw1986;

import java.util.Scanner;

public class SW1986_지그재그숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] N = new int[T];
		int[] sum = new int[T];
		for(int i=0; i<T; i++) {
			N[i] = sc.nextInt();
		}
		for(int i=0; i<T; i++) {
			for(int j=1; j<=N[i]; j++) {
				if((j%2)==0) sum[i] += -j;
				else sum[i] += j;
			}
		}
		for(int i=0; i<T; i++) {
			System.out.printf("#%d %d\n", i+1, sum[i]);
		}
	}
}
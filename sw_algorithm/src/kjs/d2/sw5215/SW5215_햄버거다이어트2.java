package kjs.d2.sw5215;

import java.util.Scanner;

public class SW5215_햄버거다이어트2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    for (int tc = 1; tc <= t; tc++) {
	        int N = sc.nextInt(), K = sc.nextInt();
	        int[] Ti = new int[N+1], Ki = new int[N+1];
	        Ti[0] = 0; Ki[0] = 0;
	        for (int i = 1; i <= N; i++) {
	            Ti[i] = sc.nextInt(); Ki[i] = sc.nextInt();
	        }
	        int[][] opt = new int[N+1][K+1];
	        opt[0][0] = 0;
	        for (int i = 0; i <= K; i++) opt[0][i] = 0;
	        for (int i = 1; i <= N; i++) {
	            for (int j = 0; j <= K; j++) {
	                if (Ki[i] > j)
	                    opt[i][j] = opt[i-1][j];
	                else
	                    opt[i][j] = ((opt[i-1][j] >= (opt[i-1][j-Ki[i]]+Ti[i]))? opt[i-1][j]:((opt[i-1][j-Ki[i]])+Ti[i]));
	            }
	        }
	        System.out.printf("#%d %d\n", tc, opt[N][K]);
	    }
	}
}
/**
#include <stdio.h>
 
int main(void) {
    int t;
    setbuf(stdout, NULL);
    scanf("%d", &t);
    for (int z = 1; z <= t; z++) {
        int n, k;
        scanf("%d%d", &n, &k);
        int v[21] = { 0, };
        int c[21] = { 0, };
        for (int i = 1; i <= n; i++) {
            scanf("%d%d",  &c[i], &v[i]);
        }
        int opt[21][10002] = { { 0, }, };
        for (int i = 0; i <= k; i++)
            opt[0][i] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (v[i] > j) {
                    opt[i][j] = opt[i - 1][j];
                }
                else {
                    opt[i][j] = ((opt[i - 1][j] >= (opt[i - 1][j - v[i]] + c[i])) ? opt[i - 1][j] : ((opt[i - 1][j - v[i]]) + c[i]));
                }
            }
        }
        printf("#%d %d\n", z, opt[n][k]);
    }
    return 0;
}
*/
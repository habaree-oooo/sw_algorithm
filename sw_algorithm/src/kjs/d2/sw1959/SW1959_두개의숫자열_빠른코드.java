package kjs.d2.sw1959;

import java.util.Scanner;

public class SW1959_두개의숫자열_빠른코드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			int n = sc.nextInt(), m = sc.nextInt();
			int[] Ai = new int[n], Bj = new int[m];
			for(int i=0; i<n; i++)
				Ai[i] = sc.nextInt();
			for(int i=0; i<m; i++)
				Bj[i] = sc.nextInt();
			int[] maxArr, minArr;
			if(n>=m) {
				maxArr = Ai;
				minArr = Bj;
			}else {
				minArr = Ai;
				maxArr = Bj;
			}
			int maxSum = 0;
			for(int i=0; i<=(maxArr.length-minArr.length); i++) {
				int subSum = 0;
				for(int j=0; j<minArr.length; j++) {
					subSum += maxArr[j+i] * minArr[j];
				}
				if(maxSum < subSum) maxSum = subSum;
			}
			System.out.printf("#%d %d\n", tc, maxSum);
		}
	}
}
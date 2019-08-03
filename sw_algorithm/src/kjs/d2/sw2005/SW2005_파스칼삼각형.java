package kjs.d2.sw2005;

import java.util.Scanner;

public class SW2005_파스칼삼각형 {
	static Scanner sc = new Scanner(System.in);
	static int[][] arry = null;
	
	public static void main(String[] agrs) {
		int t = sc.nextInt();
		int[] n = new int[t];
		for(int i=0; i<t; i++) {
			n[i] = sc.nextInt();
		}
		
		for(int q=0; q<n.length; q++) {
			arry = new int[n[q]][n[q]];
			// 입력.
			for (int i = 0; i < arry.length; i++) {
				for (int j = 0; j < arry[i].length; j++) {
					arry[i][j] = getCnt(i-1, j-1) + getCnt(i-1, j); 
					if(i == j) break;
				}
			}
			// 출력.
			System.out.println("#" + (q+1));
			for (int i = 0; i < arry.length; i++) {
				for (int j = 0; j < arry[i].length; j++) {
					System.out.printf("%s%s", arry[i][j] == 0 ? " " : arry[i][j], " ");
				}
				System.out.println();
			}
		}
		
	}
	
	public static int getCnt(int x, int y) {
		try {
			if(x < 0 && y < 0)
				return 1;
			else
				return arry[x][y];
		}catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}
}

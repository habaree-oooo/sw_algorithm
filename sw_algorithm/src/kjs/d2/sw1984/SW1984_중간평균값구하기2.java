package kjs.d2.sw1984;

import java.util.Scanner;

public class SW1984_중간평균값구하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] arr = new int[t][10];
		for(int a=0; a<t; a++) // 입력
			for(int b=0; b<10; b++)
				arr[a][b] = sc.nextInt();
		for(int a=0; a<t; a++) {
			double sum = 0;
			double min = arr[a][0];
			double max = arr[a][0];
			for(int b=0; b<10; b++) {
				if(min > arr[a][b]) min = arr[a][b];
				if(max < arr[a][b]) max = arr[a][b];
				sum += arr[a][b];
			}
			System.out.printf("#%d %d\n", a+1, (int) Math.round((sum - min - max)/8));
		}
	}
}

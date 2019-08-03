package kjs.d2.sw1984;

import java.util.Scanner;

public class SW1984_중간평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][10];
		int[] output = new int[T];
		for(int i=0; i<T; i++)
			for(int j=0; j<10; j++)
				arr[i][j] = sc.nextInt();
		for(int i=0; i<T; i++) {
			double max = arr[i][0];
			double min = arr[i][0];
			double sum = 0;
			for(int j=0; j<10; j++) {
				if(max < arr[i][j]) max = arr[i][j];
				if(min > arr[i][j]) min = arr[i][j];
				sum += arr[i][j];
			}
			output[i] = (int) Math.round((sum - max - min) / 8);
		}
		for(int i=0; i<T; i++) System.out.printf("#%d %d\n", i+1, output[i]);
	}
}

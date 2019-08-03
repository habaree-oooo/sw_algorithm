package kjs.d2.sw1859;

import java.util.Scanner;

public class SW1859_백만장자프로젝트2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1; i<=t; i++) {
			int n = sc.nextInt();
			int[] input = new int[n];
			for(int j=0; j<n; j++) input[j] = sc.nextInt();
			long sum = 0, max = input[n-1];
			for(int j=n-2; j>=0; j--) {
				if(max > input[j]) sum += max - input[j];
				else max = input[j];
			}
			System.out.printf("#%d %d\n", i, sum);
		}
	}
}
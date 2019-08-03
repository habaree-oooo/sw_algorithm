package kjs.d2.sw1983;

import java.util.Scanner;

public class SW1983_조교의성적매기기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] grade = 
			{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D"};
		for(int a=0; a<t; a++) {
			int n = sc.nextInt();
			int searchNum = sc.nextInt();
			int[] scoreArr = new int[n];
			for(int b=0; b<n; b++) { //입력
				for(int c=0; c<3; c++) {
					if(c==0) scoreArr[b] += sc.nextInt() * 35; 
					if(c==1) scoreArr[b] += sc.nextInt() * 45;
					if(c==2) scoreArr[b] += sc.nextInt() * 20;
				}
			}
			int targetGrade = scoreArr[searchNum-1];
			for(int b=0; b<n; b++) { //정렬
				for(int c=0; c<n; c++) {
					if(scoreArr[b] > scoreArr[c]) {
						int temp = scoreArr[b];
						scoreArr[b] = scoreArr[c];
						scoreArr[c] = temp;
					}
				}
			}
			for(int b=0; b<n; b++)//출력값 저장
				if(scoreArr[b] == targetGrade) 
					System.out.printf("#%d %s\n", a+1, grade[ b/(n/grade.length) ]);
		}
	}
	
}

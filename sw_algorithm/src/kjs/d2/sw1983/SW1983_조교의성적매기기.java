package kjs.d2.sw1983;

import java.util.Scanner;

public class SW1983_조교의성적매기기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			String[] grade = 
				{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D"};
			for(int j=0; j<N; j++) //입력
				for(int k=0; k<3; k++) {
					if(k==0) arr[j] += sc.nextInt() * 35;
					if(k==1) arr[j] += sc.nextInt() * 45;
					if(k==2) arr[j] += sc.nextInt() * 20;
				}
			int targetGrade = arr[K-1];
			for(int j=0; j<N; j++) //졍렬 
				for(int k=0; k<N; k++) {
					if(arr[j]>arr[k]) {
						int temp = arr[j];
						arr[j] = arr[k];
						arr[k] = temp;
					}
				}
			for(int j=0; j<N; j++)
				if(arr[j] == targetGrade)
					System.out.printf("#%d %s\n", i+1, grade[ j/(N/grade.length) ]);
		}
	}
	
}

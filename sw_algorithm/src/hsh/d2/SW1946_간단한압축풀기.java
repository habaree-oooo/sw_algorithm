package d2.sw1946;

import java.util.Scanner;

public class SW1946_간단한압축풀기 {
	static int N;
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			System.out.println("#"+tcn);
			N=  sc.nextInt();
			String[ ][ ] arr = new String[N][2];
			
			for(int i=0; i<N; i++){
				for(int j=0; j<2; j++){
					arr[i][j] = sc.next();					
				}				
			}//fill arr		
			
			solv(arr);
		
		}//tcn for	
	}//main	
	private static void solv(String[][] arr) {
		int count = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<Integer.parseInt(arr[i][1]); j++){
				count++;
				System.out.print(arr[i][0]);
				if(count==10) {
					count = 0;		
					System.out.println();
				}//if			
			}//for			
		}//for	
		System.out.println();
	}
}//class





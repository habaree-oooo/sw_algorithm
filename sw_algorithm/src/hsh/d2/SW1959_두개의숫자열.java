package d2.sw1959;

import java.util.Scanner;

public class SW1959_두개의숫자열 {
	static int N;
	static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			N = sc.nextInt();			
			M = sc.nextInt();
			
			int[ ] arrn = new int[N];
			int[ ] arrm = new int[M];
			
			for(int i=0; i<N; i++){
				arrn[i] = sc.nextInt();				
			}//fill arrn
			
			for(int i=0; i<M; i++){
				arrm[i] = sc.nextInt();				
			}//fill arrm
			
			int max=solv(arrn,arrm, Math.abs(M-N));
			System.out.println("#"+tcn+" "+max);
		}//tcn for

	}//main		
private static int solv(int[] arrn, int[] arrm, int size) {
	int sum = 0;
	int maxTotal = -1;
		if(arrn.length<arrm.length){					
			for(int i=0; i<=size; i++){					
				sum = 0;				
				for(int j=0; j<arrn.length; j++)					
					sum+= arrn[j]*arrm[j+i];						
				if(maxTotal<sum) maxTotal = sum;		
			}	
			return maxTotal;
		}else{		
			
			for(int i=0; i<=size; i++){					
				sum = 0;				
				for(int j=0; j<arrm.length; j++)				
					sum+= arrm[j]*arrn[j+i];							
				if(sum>maxTotal)maxTotal = sum;				
			}	
			return maxTotal;
		}		
	}
}//class

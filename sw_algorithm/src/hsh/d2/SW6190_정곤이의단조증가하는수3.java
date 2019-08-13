package d3.sw6190;

import java.util.Scanner;

public class SW6190_정곤이의단조증가하는수3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			int N = sc.nextInt();
			int[ ] num = new int[N];
			for(int i=0; i<N; i++){
				num[i] = sc.nextInt();
			}
			int max = -1;
			for(int i=0; i<N; i++){
				for(int j=i+1; j<N; j++){
					int value = num[i]*num[j];
					value = isAcs(value);
					if(max<value) max = value;
				}
			}
			System.out.println("#"+tcn+" "+max);
				
		}//tcn for		
	}//main

	private static int isAcs(int val) {
		
		int R = val % 10;
		int V = val / 10;
		while(V>=1){
			if(V%10>R) return -1;
			
			R = V % 10;
			V = V / 10;
		}
		return val;
	}
}//class







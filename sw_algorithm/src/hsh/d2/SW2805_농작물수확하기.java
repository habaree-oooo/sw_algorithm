package d3.sw2805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SW2805_농작물수확하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tcn=1; tcn<=T; tcn++){
			int N = Integer.parseInt(br.readLine());
			int[ ][ ] map = new int[N][N];
			for(int i=0; i<N; i++){
				String str=br.readLine();
				for(int j=0; j<N; j++){
					map[i][j] = Integer.parseInt(str.charAt(j)+"");					
				}				
			}//fill map
			
			int topSum = 0;
			int col = 0;
			int colLenth = N;
			for(int ir=N/2; ir>=0; ir--){			
				for(int ic=col; ic<colLenth; ic++)	{ 					
					topSum += map[ir][ic];				
				}			
				col++;
				colLenth--;						
			}
			
			int topSum2 = 0;
			int col2 = 1;
			int colLenth2 = N-1;
			for(int ir=N/2+1; ir<N; ir++){			
				for(int ic=col2; ic<colLenth2; ic++)	{					
					topSum2 += map[ir][ic];					
				}				
				col2++;
				colLenth2--;						
			}
			System.out.println("#"+tcn+" "+(topSum2+topSum));			
		
		}//tcn for
	}
}

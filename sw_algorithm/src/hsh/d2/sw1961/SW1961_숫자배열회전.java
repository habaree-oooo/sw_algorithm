package hsh.d2.sw1961;

import java.util.Scanner;

public class SW1961_숫자배열회전 {
	static int N;
	//static int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=  sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			N  = sc.nextInt();
			int[ ][] arr=  new int[N][N];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					arr[i][j] = sc.nextInt();					
				}				
			}//fill arr
			
			int[ ][ ] arr90 = rotation(arr);
			int[ ][ ] arr180 = rotation(arr90);
			int[ ][ ] arr270 = rotation(arr180);
			
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					System.out.print(arr90[i][j]);
										
				}
				System.out.print(" ");
				for(int j=0; j<N; j++){
					System.out.print(arr180[i][j]);
						
				}
				System.out.print(" ");	
				for(int j=0; j<N; j++){
					System.out.print(arr270[i][j]);						
				}
				System.out.print(" ");	
				System.out.println();
			}
		}//tcn for
	}
	
	private static int[][] rotation(int[][] arr) {
		int[ ][ ] newarr = new int[N][N];
		int k = N-1;//2
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				newarr[j][k]=arr[i][j];
			}
			k--;
		}		
		return newarr;
	}
}

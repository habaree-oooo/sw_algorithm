package d2.sw1954;
import java.util.Scanner;
/*
 * 
 규칙을 먼저 알아야 한다.
 가로(5)-->
 세로(4), 가로(4) -->
 세로(3), 가로(3) -->
 세로(2), 가로(2) -->
 세로(1), 가로(1) 
 
 */
public class SW1954_달팽이숫자 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn=1; tcn<=T; tcn++){
			int N = sc.nextInt();
			int[ ][ ]arr = new int[N][N];
			
			int limit = N;
			int row = 0;
			int col = -1;
			int direction = 1;
			int number = 1;
			while(true){
				if(limit==0) break;
				
				for(int i=0; i<limit; i++){
					col +=direction;
					arr[row][col] = number;
					number++;
				}
				limit--;
				
				for(int j=0; j<limit; j++){
					row +=direction;
					arr[row][col]=number;
					number++;					
				}
				direction *=-1;
			}//while
			System.out.println("#"+tcn);		
			for(int i=0;i<N; i++){
				for(int j=0; j<N; j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}//tcn for
	}//main

	
}//class

















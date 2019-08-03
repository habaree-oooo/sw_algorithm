package kjs.d2.빌딩;

import java.io.FileInputStream;
import java.util.Scanner;

public class 빌딩2 {
	static int N = 0;
	public static void main(String[] args) throws Exception{
		//System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++) {
			N = sc.nextInt();
			char[ ][ ] map = new char[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.next().charAt(0);	
				}
			}//fill up
			
			int maxBuildings = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]=='B') {
						int buildings = 0;
						int count=countPark(map,i,j);
						if(count==0) {
							//가로방향 빌딩수
							for(int col = 0; col<N; col++) {
								if(map[i][col]=='B') buildings++;
							}
							
							//세로방향 빌딩수
							for(int row = 0; row<N; row++) {
								if(map[row][j]=='B') buildings++;
							}
							
							buildings -=1;
							if(maxBuildings<buildings)
								maxBuildings = buildings;
						}else {
							if(maxBuildings<2) {
								maxBuildings = 2;
							}
						}
					}//if
				}//for
			}//for
			System.out.println("#"+tcn+" "+maxBuildings);
		}//tcn for
		
	}//main
	private static int countPark(char[][] map, int ir, int ic) {
		int count = 0;
		/*
		 * (-1,-1) (-1,0) (-1,1)
		 * (0, -1) (0, 0) (0, 1)
		 * (1, -1) (1, 0) (1, 1)
		 */
		for(int dr = -1; dr<=1; dr++) {
			for(int dc = -1; dc<=1; dc++) {
				int row = ir +dr;
				int col = ic +dc;
				if(row>=0 && row<N &&col>=0 && col<N) {
					if(map[row][col]=='G') count++;
				}
			}
		}
		return count;
	}
}//class









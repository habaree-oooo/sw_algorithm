package kjs.d2.sw1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1954_달팽이숫자 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[][] map = new int[n][n];
			int cnt = 0, x = 0, y = 0, s = (n*2)-1;
			for(int i=0; i<s; i++) {
				for(int j=1; j<=n; j++) {
					if(i%4==0){
						map[x][y] = ++cnt;
						if(j == n) x++;
						else y++;
					}else if(i%4==1){
						map[x][y] = ++cnt;
						if(j == n) y--;
						else x++;
					}else if(i%4==2){
						map[x][y] = ++cnt;
						if(j == n) x--;
						else y--;
					}else if(i%4==3){
						map[x][y] = ++cnt;
						if(j == n) y++;
						else x--;
					}
				}
				if(i%2 == 0)n--;
			}
			System.out.printf("#%d\n",tc);
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++)
					System.out.printf("%d ", map[i][j]);
				System.out.printf("\n");
			}
		}
	}
}
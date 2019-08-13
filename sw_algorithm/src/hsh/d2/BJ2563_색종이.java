package bj2563;

import java.util.Scanner;

public class BJ2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[ ][ ] map = new int[100][100];
		int count = 0;
		
		for(int tcn = 1; tcn<=N ; tcn++){			
			int x = sc.nextInt();
			int y = sc.nextInt();	
			
			
			for(int ic = x; ic<x+10; ic++){
				for(int ir = y; ir<y+10; ir++){
					if(map[ic][ir]==1) continue;	
					
					map[ic][ir] = 1;
					count++;
				}
			}			
		}//tcn for
		System.out.println(count);
	}
}

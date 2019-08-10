package d2.sw1285;

import java.util.ArrayList;
import java.util.Scanner;

public class SW1285_아름이의돌던지기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcn = 1; tcn<=T; tcn++){
			int N = sc.nextInt();
			int[ ] arr = new int [N];
			int min = 99999;
			int diff = 0;
			for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt(); //-5, -1, 3
				diff = Math.abs(arr[i])-0;//5,1,3
				if(diff<min) min = diff;
				
			}//fill arr
			
			int count = 0;
			for(int i=0; i<arr.length; i++){
				if(Math.abs(arr[i])==min)count++;
			}
			
			System.out.println("#"+tcn+" "+min+" "+count);
		}//tcn for
	}//main
}//class









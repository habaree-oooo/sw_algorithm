package d2.sw1204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SW1204_최빈수구하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//10
		
		for(int tcn=1; tcn<=T; tcn++){
			
			int[ ] st = new int[1000];
			int[ ] jumsu = new int[101];
			int inputTcn = sc.nextInt();
			ArrayList<Integer> maxis = new ArrayList<>();
			int max = -1;
			
			for(int i=0; i<st.length;i++)
				jumsu[sc.nextInt()]++;		//fill
			
			
			for(int i=0; i<jumsu.length; i++)
				if(max<jumsu[i]) max = jumsu[i];
			
			
			for(int i=0; i<jumsu.length; i++){
				if(jumsu[i]==max) maxis.add(new Integer(i));
					
			}
			System.out.println("#"+inputTcn+" "+maxis.get(maxis.size()-1));
		}//tcn for
	}//main
}//class


/*
 2
 1
 3 1 2 3 2 3 2 1 5 4
 2
 5 5 5 1 2 3 5 4 4 4
 */



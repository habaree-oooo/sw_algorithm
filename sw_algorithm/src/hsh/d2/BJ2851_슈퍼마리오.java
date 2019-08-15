package bj2851;

import java.util.Scanner;

public class BJ2851_슈퍼마리오 {
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int moresum = 0;
		int lesssum = 0;
		int num [ ] = new int[10];
		int moreindex = 0;
		int lessindex = 0;
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt(); //fill		
		}
		
		for(int i=0; i<10; i++) {
			moresum+=num[i];
			if(moresum>100) {
				moreindex = i;			
				break;
			}		
			
		}//for
		
		for(int i=0; i<moreindex; i++) 
			lesssum+=num[i];
						
		if(Math.abs(100-moresum)>Math.abs(100-lesssum))sum = lesssum;
		else if (Math.abs(100-moresum)<Math.abs(100-lesssum))sum = moresum;
		else sum = moresum;
		
		System.out.println(sum);
		
		
	}
}

/*
10
20
30
38
4
60
70
80
90
100




*/
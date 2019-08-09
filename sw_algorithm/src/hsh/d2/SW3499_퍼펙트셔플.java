package d3.sw3499;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SW3499_퍼펙트셔플 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		
		int T=  sc.nextInt();
		
		for(int tcn = 1; tcn<=T; tcn++){		
			int N = sc.nextInt();
			String[ ] str = new String[N];
			
			for(int i=0; i<N; i++){
				str[i] = sc.next();
			}
			
			ArrayList<String> front = new ArrayList<>();
			ArrayList<String> back = new ArrayList<>();
			
			System.out.print("#"+tcn+" ");
			if(str.length%2==0){				
			
				for(int i=0; i<str.length/2; i++)  front.add(str[i]);
				for(int i=str.length/2; i<str.length; i++) back.add(str[i]);
			
				for(int i=0; i<str.length/2; i++){
					System.out.print(front.get(i)+" ");
					System.out.print(back.get(i)+" ");
				}
			}else{
				for(int i=0; i<str.length/2; i++)  front.add(str[i]);
				for(int i=str.length/2+1; i<str.length; i++) back.add(str[i]);
				
				for(int i=0; i<str.length/2; i++){
					System.out.print(front.get(i)+" ");
					System.out.print(back.get(i)+" ");					
				}
				System.out.print(str[str.length/2]);
			}
			System.out.println();
		}//tcn for
	}//main
}//class











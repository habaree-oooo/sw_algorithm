package kjs.d2.sw1989;

import java.util.Scanner;

public class SW1989_초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] input = new String[T];
		for(int a=0; a<T; a++) {
			input[a] = sc.next();
		}
		for(int a=0; a<T; a++) {
			boolean temp = false;
			int c = input[a].length()-1 ;
			for(int b=0; b<input[a].length(); b++) {
				if(c>=0){
					if(b==c) break;
					if(input[a].substring(b,b+1).equals(input[a].substring(c,c+1))) temp = true;
					else {
						temp = false;
						break;
					}
					c--;
				}
			}
			System.out.printf("#%d %d\n",a+1,temp==true? 1:0);
		}
	}
}

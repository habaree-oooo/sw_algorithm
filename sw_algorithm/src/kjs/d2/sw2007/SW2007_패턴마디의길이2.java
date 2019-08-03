package kjs.d2.sw2007;

import java.util.Scanner;

public class SW2007_패턴마디의길이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int temp = 0;
		for(int i=0; i<10; i++) {
			String s1 = str.substring(0,i);
			String s2 = str.substring(i,i+1);
			if(s1.equals(s2)) {
				temp = i;
				break;
			}
		}
		System.out.println(temp);
	}
}

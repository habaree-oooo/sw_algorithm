package kjs.d2.sw2007;

import java.util.Scanner;

public class SW2007_패턴마디의길이 {
	static Scanner sc = new Scanner(System.in);
//	static int t = sc.nextInt();
	static int t = 3;
//	static String[] input = new String[t];
	static String[] input = {
		"KOREAKOREAKOREAKOREAKOREAKOREA",
		"SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA",
		"GALAXYGALAXYGALAXYGALAXYGALAXY",
	};
	
	public static void main(String[] args) {
//		for(int i=0; i<t; i++) {
//			input[i] = sc.nextLine();
//		}
		for(int i=0; i<t; i++) {
			String str = input[i];
			String startStr = str.substring(0, 1);
			int idx = str.indexOf(startStr);
			System.out.println(idx);
//			String sp = str.substring(beginIndex, endIndex)
		}
	}
}

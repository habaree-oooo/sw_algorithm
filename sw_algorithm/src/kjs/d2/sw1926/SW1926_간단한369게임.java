package kjs.d2.sw1926;

import java.util.Scanner;

public class SW1926_간단한369게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[] arr = {'3', '6', '9'};
		for(int i=1; i<=n; i++) {
			String result = "";
			char[] clist = (i+"").toCharArray();
			for(int k=0; k<clist.length; k++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[j] == clist[k]) {
						result += "-";
					}
				}
			}
			if("".equals(result)) {
				System.out.printf("%d ", i);
			}else {
				System.out.printf("%s ", result);
			}
		}
		
	}
}
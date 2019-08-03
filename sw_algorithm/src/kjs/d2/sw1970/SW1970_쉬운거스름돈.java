package kjs.d2.sw1970;

import java.util.Scanner;

public class SW1970_쉬운거스름돈 {
	static Scanner sc = new Scanner(System.in);
	static int[] money = {50000 ,10000 ,5000 ,1000 ,500 ,100 ,50 ,10};
	static int[] map = {0, 0, 0, 0, 0, 0, 0, 0};
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			for(int i=0; i<money.length; i++) {
				map[i] = N/money[i];
				N = N%money[i];
			}
			String result = "";
			for(int i=0; i<map.length; i++) {
				if (i==0) result = map[i]+"";
				else result += " " + map[i];
			}
			System.out.printf("#%d\n%s\n",tc,result);
		}
	}
}
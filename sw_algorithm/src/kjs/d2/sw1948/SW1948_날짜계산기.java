package kjs.d2.sw1948;

import java.util.Scanner;

/**
 * @author ck
 * 20,572 kb / 152 ms / 628
 */
public class SW1948_날짜계산기{
	static int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static Scanner sc = new Scanner(System.in);
	static int[] input = new int[4];
	public static void main(String[] args) {
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			for(int i=0; i<input.length; i++)
				input[i] = sc.nextInt();
			int firstDay = input[1];
			int lastDay = input[3];
			for(int i=0; i<input[0]-1; i++)
				firstDay += day[i];
			for(int i=0; i<input[2]-1; i++)
				lastDay += day[i];
			int result = lastDay - firstDay + 1;
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
package kjs.d2.sw1948;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author ck
 * 20,572 kb / 152 ms / 628 - 1차
 * 18,556 kb / 121 ms / 866 - 2차
 */
public class SW1948_날짜계산기2{
	static int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int[] input = new int[4];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws Exception{
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<input.length; i++)
				input[i] = Integer.parseInt(st.nextToken());
			int firstDay = input[1], lastDay = input[3];
			for(int i=0; i<input[0]-1; i++)
				firstDay += day[i];
			for(int i=0; i<input[2]-1; i++)
				lastDay += day[i];
			int result = lastDay - firstDay + 1;
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
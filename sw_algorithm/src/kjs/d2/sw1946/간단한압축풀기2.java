package kjs.d2.sw1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한압축풀기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= t; tc++) {
			sb = new StringBuilder();
			System.out.println("#"+(tc));
			int rows = Integer.parseInt(br.readLine());
			for (int i=0; i<rows; i++) {
				String[] str = br.readLine().split(" ");
				String s = str[0];
				int r = Integer.parseInt(str[1]);
				for (int j = 0; j < r; j++) sb.append(s);
			}
			char[] ca = sb.toString().toCharArray();
			for (int i = 0; i < sb.length(); i++) {
				if (i % 10 == 9) System.out.println(ca[i]);
				else System.out.print(ca[i]);
			}
			System.out.println();
		}
	}

}
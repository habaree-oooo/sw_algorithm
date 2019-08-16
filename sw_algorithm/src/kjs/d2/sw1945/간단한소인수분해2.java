package kjs.d2.sw1945;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한소인수분해2 {
	public static int[] fac = { 2, 3, 5, 7, 11 };
	public static int[] cnt = new int[5];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		for (int n = 0; n < x; n++) {
			cnt = new int[5];
			int num = Integer.parseInt(br.readLine());
			for (int i = 0; i < 5; i++) {
				while (num % fac[i] == 0) {
					++cnt[i];
					num /= fac[i];
				}
			}
			System.out.print("#" + (n + 1) + " ");
			for (int i = 0; i < 5; i++)
				System.out.print(cnt[i] + " ");
			System.out.println();
		}
	}

}
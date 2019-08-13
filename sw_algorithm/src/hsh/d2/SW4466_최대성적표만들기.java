package d3.sw4466;

import java.util.Arrays;
import java.util.Scanner;

public class SW4466_최대성적표만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcn = 1; tcn<=T; tcn++){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0;
			int[ ] jumsu=  new int[N];
			for(int i=0; i<N; i++){
				jumsu[i] = sc.nextInt();
			}
			
			Arrays.sort(jumsu);
			for(int i=N-1; i>=N-K; i--){
				sum += jumsu[i];
			}
			System.out.println("#"+tcn+" "+sum);
		}//tcn for
	}
}

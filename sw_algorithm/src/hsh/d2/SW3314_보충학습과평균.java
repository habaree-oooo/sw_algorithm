package d3.sw3314;

import java.util.Scanner;

public class SW3314_보충학습과평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[ ] stu = new int[5];
		for(int tcn = 1; tcn<=T; tcn++){
			for(int i=0; i<5; i++){
				stu[i] = sc.nextInt();
				if(stu[i]<40) stu[i] = 40;
			}
			
			int sum = 0;
			for(int i=0; i<5; i++){
				sum += stu[i];
			}
			System.out.println("#"+tcn+" "+sum/5);
		}

	}
}






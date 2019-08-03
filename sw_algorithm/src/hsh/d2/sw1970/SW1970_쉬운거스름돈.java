package hsh.d2.sw1970;

import java.util.Scanner;

public class SW1970_쉬운거스름돈 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[ ] money ={50000,10000,5000,1000,500,100,50,10};
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			int N = sc.nextInt();
			int oneth = N/money[0];
				int remain1 = N-(oneth * money[0]);
			int towth = remain1/money[1];
			    int remain2 = remain1-(towth * money[1]);
			int threeth = remain2/money[2];
				int remain3 = remain2-(threeth * money[2]);
			int fourth = remain3/money[3];
				int remain4 = remain3-(fourth * money[3]);
			int fiveth = remain4/money[4];
				int remain5 = remain4-(fiveth * money[4]);
			int sixth = remain5/money[5];
				int remain6 = remain5-(sixth * money[5]);
			int seventh = remain6/money[6];
				int remain7 = remain6-(seventh * money[6]);
			int eightth = remain7/money[7];
				int remain8 = remain7-(eightth * money[7]);
			System.out.println("#"+tcn);
			System.out.print(oneth+" "+towth+" "+threeth+" "+fourth+" "+fiveth+" "+sixth+" "+seventh+" "+eightth);
		}

	}

}

package d3.sw3456;

import java.util.Scanner;


public class SW3456_직사각형길이찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcn = 1; tcn<=T; tcn++){
			
			int x = 0;
		
			int a = sc.nextInt();
			int	b = sc.nextInt();
			int	c = sc.nextInt();					
			
			if(a==b && b==c){
				x = a;
			}else{
				if(a-b==0) x = c;
				else if(a-c==0) x = b;
				else x = a;
			}
			
			System.out.println("#"+tcn+" "+x);
		}//tcn for
	}
}

















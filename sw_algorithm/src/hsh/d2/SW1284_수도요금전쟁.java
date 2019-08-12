package d2.sw1284;

import java.util.Scanner;

/*
 * A사 --> W * P원
 * B사 -->  1)   if(W<=R)--> Q원
 *          2)  else-->(W-R) * S + Q
 *  ::
 *  P - 1L당 요금
 *  Q
 *  R
 *  S
 *  W
 */
public class SW1284_수도요금전쟁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
			
		for(int tcn=1; tcn<=T; tcn++){
			int P = sc.nextInt(); //1리터당 p원의 돈을 낸다(A회사)
			int Q = sc.nextInt(); // 기본요금(월간 사용량이 R리터 이하인 경우 기본요금만..B사)
			int R = sc.nextInt(); //R리터이하인 경우 기본 요금
			int S = sc.nextInt(); //R리터 초과인경우 1리터당 S원의 요금을 더 내야함.
			int W = sc.nextInt(); //집에서 한달간 사용하는 수도의 양
			
			String[ ] coms = new String[2];
			coms[0] = "A";
			coms[1] = "B";
			
			int money = 0;
			int AMoney = 999999;	
			int BMoney = 999999;
			int lastMoney = 999999;
			
			for(int i=0; i<coms.length; i++){
				if(coms[i].equals("A")){
					money = P*W;
					if(money<=AMoney) AMoney = money; //2000
				}else{
					if(W<=R){
						money = 0;
						money = Q;
						if(money<=BMoney) BMoney = money;
					}else{
						money = 0;
						money = Q+((W-R)*S);	 
						if(money<=BMoney) BMoney = money; //1800
					}
				}
			}			
			if(AMoney-BMoney>0) lastMoney = BMoney;
			else lastMoney = AMoney;
			System.out.println("#"+tcn+" "+lastMoney);
		}//for
	}//main
}//class











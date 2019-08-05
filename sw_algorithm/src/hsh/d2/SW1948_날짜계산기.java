package d2.sw1948;

import java.util.Scanner;

public class SW1948_날짜계산기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tcn=1; tcn<=T; tcn++){
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			
			int totalDay=dateCal(month1,day1, month2,day2);
			System.out.println("#"+tcn+" "+totalDay);
		}
	}

	private static int dateCal(int month1, int day1, int month2, int day2) {
		int gapDate = 0;
		int tempDay = 0;		
		if(month2>month1){ 
			for(int month=month2-1; month>month1; month--){			
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||month==12)
					gapDate +=31;					
				else if(month==2)
					gapDate +=28;				
				else
					gapDate +=30;			
			}//for
		
			switch(month1){
			case 2 : 			
				tempDay=28-day1 +1;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				tempDay=30-day1 +1;
				break;
			default :
				tempDay=31-day1 +1;						
			}	
			return gapDate+tempDay+day2;		
		}else{ //동일한 달일경우 따로 계산해야 한다.
			return day2-day1+1;
		}		
	}
}

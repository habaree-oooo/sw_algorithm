package d3.sw4789;
/*
 * 1. 처음 든 생각-->
 * 전부다 박수를 쳐야하니깐...0인 자리의 숫자만 알아서 그 갯수를 더하면 되지 않을까?
 * 
 * 2. 다음에 든 생각-->
 * 배열의 인덱스보다 그 앞에 박수친 사람은 많거나 적어도 같아야한다.
 * 배열의 인덱스를 활용해서 박수친 사람이 적지 않도록 제어하는 로직을 짜야한다.
 * 
 * 
 */
import java.util.Scanner;

public class SW4789_성공적인공연기획2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tcn = 1; tcn<=T; tcn++){
			String str = sc.next();
			int[ ] num = new int[str.length()];
			
			for(int i=0; i<num.length; i++){
				num[i] = str.charAt(i)-'0';				
			}//fill
			
			int clap = num[0];
			int helper = 0;
			for(int j=1; j<num.length; j++){
				if(clap>=j){
					clap +=num[j];
				}else{
					helper += j-clap;
					clap += j-clap+num[j];
				}
			}
			System.out.println("#"+tcn+" "+helper);
		}//tcn for
	}//main
}//class















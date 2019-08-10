package d2.sw1288;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class SW1288_새로운불면치료법 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tcn=1; tcn<=T; tcn++){
			
			String[ ] arr = new String[10];
			Set<String> set = new HashSet<>();
			String N = br.readLine();
			
			int count = 1;			
			int temp = 0;
			while(true){
				
				if(count==1){
					for(int i=0; i<N.length(); i++){
						arr[Integer.parseInt(N.charAt(i)+"")]=N.charAt(i)+"";
						set.add(N.charAt(i)+"");						
					}	
					count++;
				}else{
					if(set.size()==10) break;
					temp = Integer.parseInt(N);
					temp *=count;	
					
					for(int i=0; i<String.valueOf(temp).length(); i++){
						arr[Integer.parseInt(String.valueOf(temp).charAt(i)+"")]=String.valueOf(temp).charAt(i)+"";
						
						set.add(String.valueOf(temp).charAt(i)+"");		
						
					}	
					count++;
				}
			}//else
			
			System.out.println("#"+tcn+" "+temp);
		}		
	}
}






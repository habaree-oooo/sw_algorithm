package d3.sw7728;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SW7728_다양성측정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tcn = 1; tcn<=T; tcn++){
			char[ ] ch = sc.next().toCharArray();
			int[ ] nums = new int[ch.length];
			Set<Integer> set = new HashSet<>();
			for(int i=0; i<ch.length; i++){
				nums[i]= Integer.parseInt(ch[i]+"");
				set.add(nums[i]);
			}
			
			System.out.println("#"+tcn+" "+set.size());
			
		}

	}

}

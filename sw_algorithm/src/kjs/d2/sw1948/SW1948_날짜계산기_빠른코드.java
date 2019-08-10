package kjs.d2.sw1948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author ck
 * 21,940 kb / 67 ms / 1,126
 */
public class SW1948_날짜계산기_빠른코드{
	public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int tn=Integer.parseInt(br.readLine());
         
        for(int i=1;i<=tn;i++) {
            st=new StringTokenizer(br.readLine());
            int[] input=new int[4];
            int result=0;
            int[] days=new int[2];
             
            for(int j=0;j<4;j++) {
                input[j]=Integer.parseInt(st.nextToken());
            }
             
             
            for(int j=input[0];j<input[2];j++) {
                result+=transMtoD(j);
            }
             
             
            days[0]=result;
            if(input[3]==input[1])days[1]=0;
            else days[1]=input[3]-input[1]+1;
             
            result=days[0]+days[1];
             
             
            System.out.println("#"+i+" "+result);
             
        }
    }
    public static int transMtoD(int N) {
        int days=0;
         
        switch(N){
        case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            days=31;
            break;
        case 2:
            days=28;
            break;
        case 4:case 6:case 9:case 11:
            days=30;
            break;
        default:
            break;
         
        }
        return days;
    }
}
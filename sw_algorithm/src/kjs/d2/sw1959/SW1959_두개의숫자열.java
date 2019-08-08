package kjs.d2.sw1959;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1959_두개의숫자열 {
	public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int tn=Integer.parseInt(br.readLine());
         
        for(int i=1;i<=tn;i++) {
            st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            int[] Aj=new int[N];
            int[] Bj=new int[M];
            int max=0;
            st=new StringTokenizer(br.readLine());
             
            for(int j=0;j<N;j++) {
                Aj[j]=Integer.parseInt(st.nextToken());
            }
             
            st=new StringTokenizer(br.readLine());
             
            for(int j=0;j<M;j++) {
                Bj[j]=Integer.parseInt(st.nextToken());
            }
             
            if(N<=M) {
                max=calcul(Aj,Bj);
            }else {
                max=calcul(Bj,Aj);
            }
             
            System.out.println("#"+i+" "+max);
        }
    }
    public static int calcul(int[] a, int[] b) {
        int max=0;
        int sum=0;
        for(int i=0;i<b.length-a.length+1;i++) {
            for(int j=0;j<a.length;j++) {
                sum+=(a[j]*b[i+j]);
            }
            if(max<sum)max=sum;
            sum=0;
        }
        return max;
    }
}
package kjs.d2.sw1284;

import java.io.*;

public class 수도요금경쟁2 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), test=0;
         
        while(test++ < T) {
            String[] input = br.readLine().split(" ");
            int P = Integer.parseInt(input[0]);
            int Q = Integer.parseInt(input[1]);
            int R = Integer.parseInt(input[2]);
            int S = Integer.parseInt(input[3]);
            int W = Integer.parseInt(input[4]);
             
            int cost1=P*W, cost2=0;
             
            if(W <= R)
                cost2 = Q;
            else
                cost2 = (W-R)*S+Q;
             
            if(cost1 > cost2)
                System.out.println("#"+test+" "+cost2);
            else
                System.out.println("#"+test+" "+cost1);
                 
        }
    }
 
}
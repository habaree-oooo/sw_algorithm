package kjs.d2.sw1928;

import java.io.IOException;
import java.util.Scanner;
 
public class Base64Decoder2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
 
        int n = Integer.parseInt(s.nextLine());
        for(int i = 0; i<n; i++) {
            String input = s.nextLine();
            String result = "";
            for(int j = 0; j < input.length() / 4; j++) {
                String substr = input.substring(j*4, (j+1)*4);
                long value = 0;
                for(int k = 0; k < 4; k++) {
                    if(substr.charAt(k) >= (int)'A' && substr.charAt(k) <= (int)'Z') 
                    	value += (substr.charAt(k) - 'A') * Math.pow(2, (18-6*k));
                    else if(substr.charAt(k) >= (int)'a' && substr.charAt(k) <= (int)'z') 
                    	value += (substr.charAt(k) - 'a' + 26) * Math.pow(2, (18-6*k));
                    else if(substr.charAt(k) >= (int)'0' && substr.charAt(k) <= (int)'9') 
                    	value += (substr.charAt(k) - '0' + 52) * Math.pow(2, (18-6*k));
                    else if(substr.charAt(k) == (int)'+') 
                    	value += 62 * Math.pow(2, (18-6*k));
                    else if(substr.charAt(k) == (int)'*') 
                    	value += 63 * Math.pow(2, (18-6*k));
                }
 
                result += (char)(value / Math.pow(2,16));
                result += (char)((value % Math.pow(2,16)) / Math.pow(2,8));
                result += (char)(value % Math.pow(2,8));
            }
 
            System.out.println("#" + (i+1) + " " + result);
        }
    }
}
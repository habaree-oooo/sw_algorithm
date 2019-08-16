package kjs.d2.sw1928;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Base64Decoder3 {
 
    public static void main(String[] args) throws Exception {
        new Base64Decoder3().run();
    }
 
    private void run() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        char[] table = new char[64];
        createTable(table);
 
        int t = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc < t + 1; tc++) {
            sb.append("#").append(tc).append(" ");
 
            StringBuilder sb2 = new StringBuilder();
            String input = br.readLine();
 
            int[] binary8 = new int[input.length()];
            for (int i = 0; i < input.length(); i++) {
                int c = searchTable(table, input.charAt(i));
                String str = convertBinary(c).toString();
                sb2.append(str);
            }
            for (int i = 0; i < sb2.length(); i += 8) {
                sb.append((char)convert8(sb2.substring(i, i + 8)));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
 
    private void createTable(char[] table) {
        char c;
        c = 'A';
        for (int i = 0; i < 26; i++) {
            table[i] = c;
            c += 1;
        }
        c = 'a';
        for (int i = 26; i < 52; i++) {
            table[i] = c;
            c += 1;
        }
        c = '0';
        for (int i = 52; i < 62; i++) {
            table[i] = c;
            c += 1;
        }
        table[62] = '+';
        table[63] = '/';
    }
 
    private int searchTable(char[] table, char data) {
        int t = -1;
        for (int i = 0; i < 64; i++)
            if (table[i] == data)
                t = i;
        return t;
    }
 
    private StringBuilder convertBinary(int n) {
        StringBuilder sb = new StringBuilder();
        int c = 5;
 
        while (c >= 0) {
            sb.append(n % 2);
            n /= 2;
            c--;
        }
        sb.reverse();
        return sb;
    }
 
    private int convert8(String str) {
        int result = 0;
         
        result += (str.charAt(0) - '0') * 128;
        result += (str.charAt(1) - '0') * 64;
        result += (str.charAt(2) - '0') * 32;
        result += (str.charAt(3) - '0') * 16;
        result += (str.charAt(4) - '0') * 8;
        result += (str.charAt(5) - '0') * 4;
        result += (str.charAt(6) - '0') * 2;
        result += (str.charAt(7) - '0') * 1;
 
        return result;
    }
}
package kjs.d2.sw1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class SW1954_달팽이숫자_빠른코드 {
 
    static int N;
    static int[][] Array;
     
    public static int changeDirection(int d) {
         
        if (d == 0) return 1;
        else if (d == 1) return 2;
        else if (d == 2) return 3;
        else return 0; 
    }
 
    public static void snail() {
         
        int count = 1;
        int direction = 0;
        int x = 0;
        int y = 0;
         
        while(count <= N * N) {
             
            // Fill the array
            Array[x][y] = count;
 
            // Determine next
            if(direction == 0) y++;
            else if (direction == 1) x++;
            else if (direction == 2) y--;
            else x--;
             
            // Check a direction
            if (y > N - 1) {
                y--; x++;
                direction = changeDirection(direction);
            } else if (x > N - 1) {
                x--; y--;
                direction = changeDirection(direction);
            } else if (y < 0) {
                y++; x--;
                direction = changeDirection(direction);
            } else if (x < 0) {
                x++; y++;
                direction = changeDirection(direction);
            } else if (Array[x][y] != 0) {
                if (direction == 0) {
                    y--; x++;
                } else if (direction == 1) {
                    x--; y--;
                } else if (direction == 2) {
                    y++; x--;
                } else {
                    x++; y++;
                }
                direction = changeDirection(direction);
            }
             
            // Increase the number
            count++;
        }
 
    }
 
    public static void main(String[] args) throws IOException {
 
        int tc;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            N = Integer.parseInt(br.readLine());
            Array = new int[N][N];
            sb.append("#" + (i + 1) + "\n");
            if (N == 1)
                sb.append("1" + "\n");
            else {
                snail();
                for(int x = 0; x < N; x++) {
                    for(int y = 0; y < N; y++) {
                        sb.append(Array[x][y] + " ");
                    }
                    sb.append("\n");
                }
            }
 
        }
        System.out.println(sb.toString());
 
    }
 
}
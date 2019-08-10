package kjs.d2.sw1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1954_달팽이숫자_빠른코드2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            boolean[][] visited = new boolean[N][N];
            // 동 남 서 북 
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
             
            int dir = 0;
            int r=0;
            int c=0;
            int time = 1;
            while(time <= N * N){
                visited[r][c] = true;
                map[r][c] = time;
                int nextR = r + dy[dir];
                int nextC = c + dx[dir];
                if(nextR < 0 || nextR >= N || nextC < 0 || nextC >= N || visited[nextR][nextC]){
                    dir = (dir + 1) % 4;
                    nextR = r + dy[dir];
                    nextC = c + dx[dir];
                }
                r = nextR;
                c = nextC;
                time++;
            }
            System.out.println("#" + t );
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(map[i][j] + " ");
                }System.out.println();
            }
             
        }
    }
 
}
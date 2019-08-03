package kjs.d2.빌딩;

import java.util.Scanner;

public class 빌딩 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			int n = sc.nextInt();
			char[][] map = new char[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					map[i][j] = sc.next().charAt(0);
			int max = 0;
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					if(max < getCnt(map, i, j, n)) max = getCnt(map, i, j, n);
			System.out.printf("#%d %d\n", tc, max);
		}
	}
	public static int getCnt(char[][] map, int i, int j, int n) {
		int result = 0;
		for(int dr = -1; dr<=1; dr++) {
			for(int dc = -1; dc<=1; dc++) {
				int row = i +dr;
				int col = j +dc;
				if(row>=0 && row<n && col>=0 && col<n) {
					if(map[row][col]=='B') result++;
					if(map[row][col]=='G') return 2;
				}
			}
		}
		return result;
	}
}

/**
[문제13] 빌딩 
신도시에 빌딩들을 세우려고 한다.   
신도시를 세울 부지는 변의 길이가 N인 정사각형의 형태이며 이 부지는 가로, 
세로 길이가 1인 구획으로 나누어져 있다.
구획당 하나의 빌딩을 세울 수 있고, 
빌딩을 세울 수 있는 구획은 B로 표시, 
공원 조성단지는 G로 표시되어 있다.  
빌딩을 세울 때 인접한 구획에 공원 조성 단지 G가 있다면 2층 높이로 세울 수 있고, 
인접한 구획에 공원 조성 단지 G가 없다면 현 위치의 가로 위치에 있는 빌딩구획 B와 
세로 위치의 빌딩 구획 B의 수를 더한 크기만큼 빌딩을 세울 수 있다. 
가장 높이 세울 수 있는 빌딩은 몇 층인가?

[제한조건] 
	•	N은 자연수 3~20 의 값이다.
	•	빌딩의 높이를 결정 짓은 인접구획은 상하좌우뿐만 아니라 대각선 위치도 포함한다.
	•	현 위치가 경계일 경우 인접구획 체크는 N*N 배열 내에 있는 곳만을 대상으로 한다. 
		(N*N 배열 경계밖에는 G구역이 없다고 본다.)
	•	빌딩의 높이는 인접구획에 공원 조성 단지 G가 없을 경우 그 위치의 가로와 세로 위치의 
		빌딩(B)구획의 수의 합으로 결정한다. 현 위치의 B 구획도 포함한다.

[입력]
	•	첫 줄에는 테스트 케이스 T가 주어진다.
	•	다음 줄에는 배열의 크기인 N이 주어진다.
	•	각 배열의 값들이 빌딩 구획이면 B가, 공원조성단지이면 G가 입력된다.


출력]
각 줄은 #Ti(테스트케이스 번호) 공백을 하나 둔 다음 가장 높은 빌딩 높이를 출력한다.

[입력 예]
3
6
G B G G B B
G B G G B G 
B B B B G B
B G B B B B
G B B B B G
G B B B B G
5
G B G G B 
G B G G B  
B B B B G 
B G B B B 
G B B B B 
3
G G B
G B B
B B B

[출력 예]
#1 7
#2 7
#3 5
 */


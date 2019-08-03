package kjs.d2.sw1926;

import java.util.Scanner;

public class SW1926_간단한369게임2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      for(int i = 1; i<=N; i++){
         int start = i/10; //첫번째 숫자
         int end = i%10; //마지막 숫자
         if(start==3 || start==6 ||start==9){ //첫번째 숫자가 3,6,9로 시작하거나
            if(end==3 || end==6 || end==9){ //마지막 숫자가 3,6,9로 끝나거나
               System.out.print("--"+" ");
               continue;
            }
            System.out.print("-"+ " ");
         }else if(end==3 || end==6 || end==9){
            System.out.print("-"+" ");
         }else{
            System.out.print(i+" ");
         }
      }
   }
}
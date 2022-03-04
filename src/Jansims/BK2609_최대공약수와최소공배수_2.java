package Jansims;

import java.util.Scanner;

public class BK2609_최대공약수와최소공배수_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 더 큰 값이 N이도록 고정해놓기
        if (N < M){
            int temp = N;
            N = M;
            M = temp;
        }

        int D = 0;
        // M의 크기만큼 돌면서 N과 M이 같이 나눠지는 최대공약수 구하기
        for(int i =  M; i > 0 ; i--){
            if(N % i == 0 && M % i == 0){
                D = i;
                System.out.println(D);
                break;
            }
        }

        // 최소공배수
      System.out.println(N * M / D);

        sc.close();

    }


}

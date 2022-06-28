package Alzalzal;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BK2579_계단오르기 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int N = sc.nextInt();
        int stair[] = new int[N+1];
        int dp[] = new int[N+1];


        for(int i = 1; i < N+1; i++){
            stair[i] =  sc.nextInt();
        }
        sc.close();

        if ( N == 1){
            dp[1] = stair[1];
        }
        else if ( N == 2){
            dp[2] = stair[1]+ stair[2];
        }
        else {
            dp[1] = stair[1];
            dp[2] = stair[1]+ stair[2];

            for(int i = 3; i <= N; i++){
                dp[i] = Math.max(dp[i-2]+ stair[i], dp[i-3] + stair[i-1]+stair[i]);
            }
        }

        System.out.println(dp[N]);

    }
}

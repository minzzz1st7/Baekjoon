package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK9095_123더하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        } // input

        for(int i = 0; i < N; i++){
            int dp[] = new int[arr[i]+1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int n = 4; n <= arr[i]; n++){
                dp[n] = dp[n-1] + dp[n-2] + dp[n-3];

            }
            System.out.println(dp[arr[i]]);
        }



        br.close();
    }

}

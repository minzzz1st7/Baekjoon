package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK11726_2N타일링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int dp[] = new int[1005];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<= N; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }

        System.out.println(dp[N]);
        br.close();
    }
}

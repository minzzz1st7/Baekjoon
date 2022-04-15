package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://intrepidgeeks.com/tutorial/bai-jun-1937-greedy-panda-java

public class BK1937_GG욕심쟁이판다 {
    static int N, ans = 0, max = 0;
    static int[] X = {-1,0,1,0};
    static int[] Y = {0,1,0,-1};
    static int[][] map, dp;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dp = new int[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(dp[i], 0);
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(dp[i][j] != 0)
                    continue;

                dp[i][j] = 1;
                ans = Math.max(ans, dfs(i, j));
            }
        }

        System.out.println(ans);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(dp[i][j] + "   ");
            } System.out.println();
        }
    }

    static int dfs(int x, int y) {
        for(int i = 0; i < 4; i++) {
            int nx = x + X[i];
            int ny = y + Y[i];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] <= map[x][y])
                continue;

            if(dp[nx][ny] == 0) {
                int cnt = dfs(nx, ny);
                dp[x][y] = Math.max(dp[x][y], cnt + 1);

            }else {
                dp[x][y] = Math.max(dp[x][y], dp[nx][ny] + 1);
            }
        }

        if(dp[x][y] == 0)
            return 1;
        return dp[x][y];
    }
}

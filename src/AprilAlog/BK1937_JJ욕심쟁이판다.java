package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://intrepidgeeks.com/tutorial/bai-jun-1937-greedy-panda-java

public class BK1937_JJ욕심쟁이판다 {
    static int n, cnt, nx, ny, max;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } //input


        max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("=======  탐색 끝나고 다시 메인 반복문 들어왔음   =======");
                cnt = 0;
                dfs(1, i, j);
                dp[i][j] = max;

            }
        }


        System.out.println(max);


        br.close();
    }

    private static int dfs(int cnt, int x, int y) {


        System.out.println("cnt, x, y 인 dfs 들어옴:   " + cnt +"    " + x +"    "+ y);


        for (int i = 0; i < 4; i++) {

            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < 0 || nextY < 0 || nextX >=n || nextY >= n || map[nextX][nextY] < map[x][y]) {
                System.out.println("조건 안 맞아서 넘어감!!!!");

                continue;
            }

            if (map[nextX][nextY] > map[x][y])  {

                System.out.println("cnt값 좀 알려ㅜ저!!!    " + cnt);


                dfs(cnt+1, nextX, nextY);

                System.out.println("max값 알려줘!!!!!!      " + max);

            }
        }

        max = max <  cnt ? cnt : max ;
        dp[x][y] = max;
        System.out.println("dfs 종료함");
        return max;
    }
}

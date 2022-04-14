package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://maejing.tistory.com/entry/%EB%B0%B1%EC%A4%80-1937-JAVA-%EC%9A%95%EC%8B%AC%EC%9F%81%EC%9D%B4%ED%8C%90%EB%8B%A4

public class BK1937_욕심쟁이판다 {
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
                System.out.println("탐색 끝나고 다시 반복문 들어왔니!!!");
                cnt = 0;
                dfs(1, i, j);
                dp[i][j] = max;

            }
        }


        System.out.println(max);


        br.close();
    }

    private static void dfs(int cnt, int x, int y) {
        for (int i = 0; i < 4; i++) {

            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < 0 || nextY < 0 || nextX >=n || nextY >= n || map[nextX][nextY] < map[x][y]) {
                System.out.println("조건 안 맞아서 넘어감!!!!");

                continue;
            }

            if (map[nextX][nextY] > map[x][y]) {
                System.out.println("조건 맞아서 들어옴!!! nextX: " + nextX + "  nextY: " + nextY);

                System.out.println("cnt값 좀 알려ㅜ저!!!    " + cnt);
                dfs(cnt+1, nextX, nextY);

            }
        }


        System.out.println("============ max 출력===========   "+ max);
    }
}

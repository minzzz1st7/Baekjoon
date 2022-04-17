package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK2169_로봇조종하기 {

    static int map[][], dp[][];
    static int N, M, sum, cnt, max;
    static int dx[] = { 1, 0 , 0};
    static int dy[] = { 0, -1, 1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];
        dp = new int[N+1][M+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 1; j <= M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } //input

        sum = 0;
        dfs(1,1);
        br.close();

    }

    static int dfs(int x, int y){
        System.out.println("dfs 들어옴 : " + x +", " + y);
        max = Integer.MIN_VALUE;
        for(int i = 0; i < 3; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if ( nextX < 1 || nextY < 1 || nextX > N || nextY > N) continue;

            sum += map[x][y];
            dfs(nextX,nextY);

        }


        System.out.println("sum    "+ sum);
        return sum;
    }
}

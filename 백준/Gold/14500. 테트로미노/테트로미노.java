import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, ans;
    static int[][] board;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1 , 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean [][] visit = new boolean[N][M];
        for(int i = 0; i< N; i++){
            for(int j = 0; j < M; j++){
                visit[i][j] = true;
                dfs(i, j, 1, board[i][j], visit);
                visit[i][j] = false;
                check(i, j);
            }
        }
        System.out.println(ans);


    }

    static void dfs(int x, int y, int cnt, int sum, boolean[][] visit){

        if ( cnt >= 4){
            ans = Math.max(ans, sum);
            return;
        }


        for(int k = 0; k < 4; k++){
            int nextX = x + dx[k];
            int nextY = y + dy[k];

            if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M || visit[nextX][nextY]){
                continue;
            }

            visit[nextX][nextY] = true;
            dfs(nextX, nextY, cnt +1, sum + board[nextX][nextY], visit);
            visit[nextX][nextY] = false;
        }

    }


    static void check(int x, int y){
        if(x< N -2 && y < M-1){
            ans = Math.max(ans, board[x][y]+ board[x+1][y]+ board[x+2][y] + board[x+1][y+1]);
        }

        if (x < N-2 && y > 0){
            ans = Math.max(ans, board[x][y]+ board[x+1][y]+ board[x+2][y] + board[x+1][y-1]);
        }

        if( x > 0 && y < M-2){
            ans = Math.max(ans, board[x][y] + board[x][y+1] + board[x][y+2] + board[x-1][y+1]);
        }

        if( x< N -1 && y < M-2){
            ans = Math.max(ans, board[x][y] + board[x][y+1]+ board[x][y+2] + board[x+1][y+1]);
        }
    }


}

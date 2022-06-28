package SAMSUNGSW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// R와 B는 같이 움직인다. 둘이 붙어서 움직인다는 건 아니고
// 조건 안에서
// 근데 한 칸씩 이동하는 게 아니라 한 번 기울리면 벽에 부딪힐 때까지 움직인다.
// 나는 일단 상하좌우로 움직이ㄹ거라서... 가 아니라 . 따라서 가야하나...


public class BK13460_구슬탈출2 {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;

     st = new StringTokenizer(br.readLine(), " ");

     StringBuilder sb = new StringBuilder();

     int H = Integer.parseInt(st.nextToken());
     int W = Integer.parseInt(st.nextToken());

     int R1=0, R2=0;
     int B1=0, B2=0;
     int o1=0, o2=0;

     // 빨간 공이 이동한 횟수
     int cnt = 0;

     char board[][] = new char[H+1][W+1];

     // board에 입력값 넣음녀서 R,B,O의 좌표 저장하기
     for(int i = 0 ; i < H; i++){
         String tmp = br.readLine();
         for(int j = 0; j < W; j++){

             board[i][j] = tmp.charAt(j);

             System.out.print(board[i][j]);
             if(board[i][j] == 'R'){
                 R1 = i;
                 R2 = j;
             }
             else if (board[i][j] =='B'){
                 B1 = i;
                 B2 = j;
             }
             else if ( board[i][j]=='O'){
                 o1 = i;
                 o2 = j;
             }

         }
         System.out.println();
     }


     int dx[] = {-1, 1, 0, 0};
     int dy[] = {0, 0, -1, 1};

     int nextX = 0;
     int nextY = 0;
     for(int k = 0; k < 4; k++){
         nextX = R1 + dx[k];
         nextY = R2 + dy[k];
         cnt ++;

         if(cnt > 10){
             sb.append(-1);
         }

         if(board[nextX][nextY] =='O'){
             sb.append(cnt);
         }

         while(board[nextX][nextY]=='.'){
             nextX = nextX + dx[k];
             nextY = nextY + dy[k];

             if(board[nextX][nextY]=='O'){
                 sb.append(cnt);
                 break;
             }
             if( board[nextX][nextY]=='#'){
                 break;
                 }
             }


     }

     System.out.println(sb);

     br.close();
    }
}

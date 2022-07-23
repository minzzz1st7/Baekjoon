package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK3085_사탕게임 {
    static int N = 0;
    static int cnt = 1, max = 0;
    static char board[][];

    public static void check(){
        // 오른쪽 색상과 비교
        for(int i = 0 ; i < N; i++){
            cnt = 1;
            for(int j = 0; j < N-1; j++){
                if(board[i][j] == board[i][j+1]){
                    cnt ++;
                }
                else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }

        // 아래쪽 색상과 비교
        for(int j = 0; j < N; j++){
            cnt = 1;
            for(int i = 0; i < N-1; i++){
                if(board[i][j] == board[i+1][j]){
                    cnt ++;
                }
                else {
                    cnt = 1;
                }
                max = Math.max(max, cnt);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        board = new char[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){

                board[i][j] = line.charAt(j);
            }
        }

        // 오른쪽이랑 교환
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N-1; j++){
                char temp =  board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1]= temp;

                check();

                temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1]= temp;

            }
        }

        // 아래 색상과 교환
        for(int j = 0; j < N; j++){
            for(int i = 0; i < N-1; i++){
                char temp =  board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j]= temp;

                check();

                temp =  board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j]= temp;

            }
        }
        System.out.println(max);
    }

}

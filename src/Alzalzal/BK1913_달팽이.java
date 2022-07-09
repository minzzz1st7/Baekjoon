package Alzalzal;

import java.util.Scanner;

public class BK1913_달팽이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] board = new int[N+1][N+1];
        boolean[][] check = new boolean[N+1][N+1];

        int dx[] = { -1, 0 ,1, 0};
        int dy[] = {0 , 1, 0, -1};

        int cnt = 0, nextX = N/2, nextY = N/2;

        while(cnt < 50){
            for(int k = 0; k < 4; k++){
                nextX = nextX + dx[k];
                nextY = nextY + dy[k];

                while(true){
                    if( nextX > 0  && nextX < N && nextY > 0 && nextY < N ){

                    }
                }


            }
        }



    }
}

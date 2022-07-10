package Alzalzal;

import java.util.Scanner;

public class BK1913_달팽이1 {


    static int N = 0, M = 0;

    static int dx[] = { -1, 0 ,1, 0};
    static int dy[] = {0 , 1, 0, -1};

    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        N = sc.nextInt();
        M = sc.nextInt();

        int ansX = 0;
        int ansY = 0;

        arr = new int[N][N];
        board();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]).append(" ");
                if(arr[i][j] == M){
                    ansX = i+1;
                    ansY = j+1;
                }
            }
            sb.append("\n");
        }

        sb.append(ansX + " " + ansY);

        System.out.println(sb);
    }
    static int cnt = 1, max = 2, two = 0, next = 0;
    public static void board() {
        int X = N/2;
        int Y = N/2;

        for(int i = 1; i <= N*N; i++){
            arr[X][Y] = i;
      

            X = X + dx[next % 4];
            Y = Y + dy[next % 4];

            cnt ++;

            if(cnt == max){
                cnt = 1;
                two++;
                next ++;
            }

            if( two == 2){
                max ++;
                two = 0;
            }


        }



    }
}

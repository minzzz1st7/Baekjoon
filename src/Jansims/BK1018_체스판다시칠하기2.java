package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1018_체스판다시칠하기2 {


    static char[][] b_chess = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
    };

    static char[][] w_chess = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
    };

    static int b_min = 0;
    static int w_min = 0;

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
     int N = Integer.parseInt(st.nextToken());
     int M = Integer.parseInt(st.nextToken());

     char arr[][] = new char[N][M];
     for (int i = 0; i < N; i++) {
         String s = br.readLine();
         for (int j = 0; j < N; j++) {
             arr[i][j] = s.charAt(j);
         }
     } // 입력받기






        br.close();
    }

}

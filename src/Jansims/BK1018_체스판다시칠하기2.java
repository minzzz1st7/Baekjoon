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



        int min = Integer.MAX_VALUE;
        int totalmin = Integer.MAX_VALUE;

        for(int x = 0 ; x < N-8; x++){
            for(int y = 0; y < M-8; y++){

                int b_min = 0;
                int w_min = 0;

                for(int a = 0; a < 8; a++){
                    for(int b = 0; b < 8; b++){
                        System.out.println("arr의 좌표  "+ (x+a)+ "  "+(y+b));
                        if(b_chess[a][b] != arr[x+a][y+b]) b_min++;
                        if( w_chess[a][b] != arr[x+a][y+b]) w_min++;



                    }
                }


                //min = Math.min(b_min, w_min);

            }
            totalmin = totalmin > min ? min : totalmin;

        }
        //System.out.println(totalmin);

        br.close();
    }

}

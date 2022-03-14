package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1018_JJ체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int dx[] = { 1, 0};
        int dy[] = {0, 1};


        char arr[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j);
            }
        } // 입력받기

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {

                int cnt = 0;
                char arr2[][] = arr;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {

                        int index = 0;
                        int nextX = x + dx[index];
                        int nextY = y + dy[index];
                        if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && index < 2){
                            if (arr2[x][y] == 'W') {
                                if (arr2[nextX][nextY] != 'B') {
                                    arr2[nextX][nextY] = 'B';
                                    System.out.println(nextX+"a"+nextY);
                                    cnt++;
                                }

                            }

                            else {
                                if (arr2[nextX][nextY] != 'W') {
                                    cnt++;
                                    arr2[nextX][nextY] = 'W';
                                }

                            }index++;
                        }
                    }


                }
                min = min > cnt ? cnt : min;
                cnt = 0;
                arr2 = arr;
                if (arr2[i][j] == 'W'){
                    arr2[i][j] = 'B';
                }else{
                    arr2[i][j] = 'W';
                }
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {

                        int index = 0;
                        int nextX = x + dx[index];
                        int nextY = y + dy[index];
                        if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && index < 2){
                            if (arr2[x][y] == 'W') {
                                if (arr2[nextX][nextY] != 'B') {
                                    arr2[nextX][nextY] = 'B';
                                    cnt++;
                                }

                            }

                            else {
                                if (arr2[nextX][nextY] != 'W') {
                                    cnt++;
                                    arr2[nextX][nextY] = 'W';
                                }

                            }index++;
                        }
                    }


                }

                min = min > cnt ? cnt : min;
            }

        }
        System.out.println(min);


        br.close();
    } //main
}

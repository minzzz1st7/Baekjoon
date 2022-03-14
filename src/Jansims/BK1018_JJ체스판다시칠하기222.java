package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1018_JJ체스판다시칠하기222 {
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
        for(int i = 0; i <N-7; i++){
            for(int j = 0; j < M-7; j++){
                int cnt = 0;
                char arr2[][] = new char[arr.length][arr[0].length];
                for(int q = 0; q < arr.length; q++){
                    for(int p = 0; p < arr[q].length; p++){
                        arr2[q][p] = arr[q][p];
                    }
                }
                 for(int x = i; x < i+8; x++){
                    for(int y = j; y<j+8; y++){

                        for(int idx = 0; idx<2; idx++){
                            int nextX = x +dx[idx];
                            int nextY = y + dy[idx];
                            if (nextX<N && nextY < M){
                                if(arr2[x][y] =='W'){
                                    if(arr2[nextX][nextY] != 'B'){
                                        if(i == 1 && j == 15){
                                            System.out.println("X: "+ x+" Y : "+y + "nextX: "+ nextX+" nextY : "+nextY + "cnt: " + cnt+ "B로 변경");
                                        }
                                        arr2[nextX][nextY] = 'B';
                                        cnt++;
                                    }
                                }else{

                                    if(arr2[nextX][nextY] != 'W'){
                                        if(i == 1 && j == 15){
                                            System.out.println("X: "+ x+" Y : "+y +"nextX: "+ nextX+" nextY : "+nextY + "cnt: " + cnt+ "W로 변경");
                                        }
                                        arr2[nextX][nextY] = 'W';
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }

                }
                min = min > cnt ? cnt : min;
                cnt = 0;
                for(int q = 0; q < arr.length; q++){
                    for(int p = 0; p < arr[q].length; p++){
                        arr2[q][p] = arr[q][p];
                    }
                }
                if(arr2[i][j] == 'W'){
                    arr2[i][j] = 'B';
                }else{
                    arr2[i][j] = 'W';
                }

                for(int x = i; x < i+8; x++){
                    for(int y = j; y<j+8; y++){

                        for(int idx = 0; idx<2; idx++){
                            int nextX = x +dx[idx];
                            int nextY = y + dy[idx];
                            if (nextX<N && nextY < M){
                                if(arr2[x][y] =='W'){
                                    if(arr2[nextX][nextY] != 'B'){
                                        arr2[nextX][nextY] = 'B';

                                        cnt++;
                                    }
                                }else{

                                    if(arr2[nextX][nextY] != 'W'){
                                        arr2[nextX][nextY] = 'W';
                                        // System.out.println("che x:"+x+" y:"+y+"nextX"+nextX+"nextY"+nextY);
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }

                }
                //System.out.println(cnt+"ii"+i+"uuuu"+j);
                min = min > cnt ? cnt : min;
            }
        }
        System.out.println(min);


        br.close();
    } //main
}

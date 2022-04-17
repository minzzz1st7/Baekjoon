package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//https://eonhwa-theme.tistory.com/27
public class BK18111_마인크래프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int map[][] = new int[N][M];
        int mapcount[] = new int[256];

        int sum = B;

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                sum += map[i][j];
            }
        }

        int maxheight = sum / (N * M);
        int min_time = Integer.MAX_VALUE;
        int ans_height = 0;

        for(int h = maxheight; h >= 0 ; h--){
            int time = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(h > map[i][j]){
                        time += (h - map[i][j]) * 1;
                    }
                    else {
                        time += (map[i][j] - h) * 2;
                    }
                }
            }

            if(time < min_time){
                min_time = time;
                ans_height = h;
            }
        }

        System.out.println(min_time+" "+ans_height);
        br.close();
    }
}

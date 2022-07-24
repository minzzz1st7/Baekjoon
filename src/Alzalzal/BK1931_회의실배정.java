package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK1931_회의실배정 {

    static int N;
    static int arr[][];
    static int cnt = 1, max = 0;
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            arr[i][0] = s.charAt(0) - '0';
            arr[i][1] = s.charAt(1) - '0' ;
        }

        br.close();

        for(int i = 0; i < N; i++){
            dfs(0, i);
        }

        System.out.println(max);
    }

    public static void dfs(int depth, int i){

            for(int j = 0; j < N ; j++){

                if(i== j) continue;

                if(arr[i][1] <= arr[j][0]){
                    cnt ++;
                    check[i] = true;
                    dfs(depth+1, j);
                }

            max = Math.max(max, cnt);
        }


    }
}

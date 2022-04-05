package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = N; i <= M; i++){

            if ( N > 2){
                for(int j = 2; j < N; j++){
                    if(N % j==0 ) break;
                    else {
                        sb.append(i).append('\n');
                    }
                }

            } else if ( N == 2){
                sb.append(2).append('\n');
            }

        }
        System.out.println(sb);

        br.close();
    }
}

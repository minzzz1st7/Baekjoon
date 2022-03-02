package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BK10989수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count[] = new int[10001];

        for(int i = 0; i < N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i < 10001; i++){
            if(count[i] > 0){
                for(int j = 0 ; j < count[i]; j++){
                    sb.append(i).append('\n');
                }
            }
        }

        System.out.println(sb);



    }
}

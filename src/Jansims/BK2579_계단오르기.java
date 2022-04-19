package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK2579_계단오르기 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int step[] = new int[N+1];
        step[0] = 0;
        for(int n = 1; n < N+1; n++){
            step[n] = Integer.parseInt(br.readLine());
        }

        // 0 10 20 15 25 10 20


    }
}

package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK1003_JJ피보나치함수 {
    static int count0;
    static int count1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            count0 = 0;
            count1 = 0;

            factorial(N);
            sb.append(count0).append(" ").append(count1).append("\n");
        }

        System.out.println(sb);
    }


    static int factorial(int n){
        if ( n == 0) {
            count0 ++;
            return 0;
        }
        else if ( n == 1){
            count1 ++;
            return 1;
        }
        else {
            factorial(n-1);
            factorial(n-2);
            return n -1;
        }
    }
}

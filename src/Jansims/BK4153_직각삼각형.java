package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BK4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];
        loop: while(true){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] == 0 ) break loop;
            }
            Arrays.sort(arr);
            if( arr[2]* arr[2] == arr[1] * arr[1] + arr[0] * arr[0]){
                sb.append("right \n");
            } else {
                sb.append("wrong \n");
            }
        }

        System.out.println(sb);

    }
}

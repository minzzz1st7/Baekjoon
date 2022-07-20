package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BK1244_스위치켜고끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int str[] = new int [N+1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++){
            str[i] =  Integer.parseInt(st.nextToken());
        }

        int stuCnt= Integer.parseInt(br.readLine());
        for(int i = 0; i < stuCnt; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int gender =  Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());


            if(gender == 1){
                int time = N/number;

                for(int t = 1; t <= time; t++){
                    str[number * t] ^= 1;
                }
            }

            // 여자라면
            else{
                int cnt = 1;

                str[number] ^= 1;
                while( true ){

                    int start = number - cnt;
                    int end = number+ cnt;

                    if(start < 1 || end > N) break;

                    if(str[start] == str[end]){
                        str[start] ^= 1;
                        str[end] ^= 1;
                        cnt ++;
                    }
                    else {
                        str[number] ^= 1;
                        break;
                    }
                }
            }


        }


        for(int k = 1; k <= N; k++){
            sb.append(str[k]).append(" ");
            if ( k % 20 == 0 ){
                sb.append("\n");
            }
        }

        System.out.println(sb);


    }
}

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

        int Gender = Integer.parseInt(br.readLine());
        int genderboard[][] = new int[Gender][2];


        for(int i = 0; i < Gender; i++){
            st = new StringTokenizer(br.readLine(), " ");
            genderboard[i][0] = Integer.parseInt(st.nextToken());
            genderboard[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int[] j : genderboard){
            // 남자라면
            if(j[0] == 1){
                int time = N /j[1];
                for(int t = 1; t <= time; t++){
                   if(str[j[1] * t] == 0) {
                       str[j[1]*t] = 1;
                   }
                   else {
                       str[j[1]*t] = 0;
                   }
                }

            }

            // 여자라면
            else{
                int cnt = 1;
                int start = j[1] - cnt;
                int end = j[1]+ cnt;

                while( start > 0 && end < N + 1){

                    for(int k = 1; k < N+1; k++){
                        sb.append(str[k]).append(" ");
                    }

                    System.out.println(sb);


                    start = j[1] - cnt;
                    end = j[1]+ cnt;
                    System.out.println("Start  " +start);
                    System.out.println("end  " + end);
                    str[j[1]] ^= 1;
                    if(str[start] == str[end]){
                        str[start] ^= 1;
                        str[end] ^= 1;
                        cnt ++;
                    }
                    else{
                        str[j[1]] ^= 1;
                        break;
                    }


                }

            }


        }




    }
}
/// 입출력까지 구현함
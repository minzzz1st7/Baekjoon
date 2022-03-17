package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// cnt를 long으로 안 해줘서 계속 백준에서 틀렸다.

public class BK13458_시험감독 {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;

     int N = Integer.parseInt(br.readLine());
     int arr[] = new int[N];

     st = new StringTokenizer(br.readLine(), " ");
     for(int i = 0; i < N; i++){
         arr[i] = Integer.parseInt((st.nextToken()));
     }

     st = new StringTokenizer(br.readLine(), " ");
     int B = Integer.parseInt(st.nextToken());
     int C = Integer.parseInt(st.nextToken());

     int cnt = 0;

     for(int i = 0; i < N; i++){
         int num = arr[i] - B;
         cnt ++;

         if(num <= 0) continue;
         cnt += num/C;

         if(num % C !=0) cnt++;

     }
        System.out.println(cnt);

     br.close();
    }
}


/**
 *
 * if(num >0){
 *              if(num > C){
 *                 cnt += num / C;
 *                 if(num % C !=0){
 *                     cnt++;
 *                  }
 *              }
 *              else {
 *                   cnt ++;
 *              }
 *
 *          }
 */
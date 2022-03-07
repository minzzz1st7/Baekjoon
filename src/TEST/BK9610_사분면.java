package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK9610_사분면 {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     int N = Integer.parseInt(br.readLine());

     int Q1 = 0, Q2 = 0, Q3 = 0,Q4 = 0, AXIS = 0;

     for(int i = 0; i < N; i++){
         st = new StringTokenizer(br.readLine(), " ");
         int X = Integer.parseInt(st.nextToken());
         int Y = Integer.parseInt(st.nextToken());


        if( X > 0 && Y > 0){
             Q1++;
         }
         else if( X < 0 && Y > 0){
             Q2++;
         }
         else if( X < 0 && Y < 0){
             Q3++;
         }
         else if( X > 0 && Y < 0){
             Q4++;
         }
         else if( X ==0 && Y == 0 || Y > 0 || Y < 0){
             AXIS ++;
         } // y좌표 선 위에 있을 때
         else if( Y == 0 && X == 0 || X < 0 || X > 0){
            AXIS++;
         } // x좌표 선 위에 있을 때
     }

        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        System.out.println("Q3: " + Q3);
        System.out.println("Q4: " + Q4);
        System.out.println("AXIS: " + AXIS);

     br.close();
    }
}

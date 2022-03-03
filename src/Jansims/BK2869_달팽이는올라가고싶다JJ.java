package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK2869_달팽이는올라가고싶다JJ {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine(), " ");

     int A = Integer.parseInt(st.nextToken());
     int B = Integer.parseInt(st.nextToken());
     int V = Integer.parseInt(st.nextToken());
     br.close();

     int day = (V-A) / (A-B) + 1;

     if( (V-A) < (A - B)){
         day++;
     }

     if ( (V - A) / ( A - B) != 0 && (V- A) > ( A- B)){
         day ++;
     }



     System.out.println(day);

    }
}

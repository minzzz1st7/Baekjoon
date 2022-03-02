package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK2775부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int apt[][] = new int[k+1][n+1];

            //만약 103호를 구하고 싶다면
            int num =1;
            for(int i = 0; i <= k; i++){
                for(int j = 1; j <= n; j++){
                    if( i ==0 ){
                        apt[i][j] = num;
                        num++;
                    } else{
                        apt[i][j] = apt[i][j-1] + apt[i-1][j];
                    }
                }
            }
            System.out.println(apt[k][n]);
        }
        br.close();
    }
}

package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// x_length * 2랑 x_length * x_length 는 다르다.
// 편의점 가는 것마다 20병 채워오는 게 아닌 버리고 오는 병 만큼 채워주는 거라고 생각해야 한다.
// 그냥 병의 개수를 다시 20으로 맞춰주면 된다.

public class BK9205_맥주마시면서걸어가기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        // 각 간격이 1000미터 이내면 happy!!
        for(int tc = 0; tc< T; tc++){
            int n = Integer.parseInt(br.readLine()); //편의점의 개수

            int arr[][] = new int[n+2][n+2];
            for(int i = 0 ; i < n+2; i++){
                st = new StringTokenizer(br.readLine(), " ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            } // 배열에 입력 잘 받아짐


            double length = 0;

            int bottle = 20;
            for(int a= 0; a < n+1; a++) {
                double x_length = arr[a + 1][0] - arr[a][0];
                double y_length = arr[a + 1][1] - arr[a][1];


                length = Math.sqrt(x_length * x_length + y_length * y_length);

                bottle -= length/50;

                if(bottle < 0){
                    System.out.println("sad");
                    break;
                }

                 bottle = 20;

            }
            if(bottle >= 0) {
                System.out.println("happy");
            }

        }

     br.close();
    }
}

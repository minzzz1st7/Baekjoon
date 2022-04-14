package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BK7568_덩치{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        int[][] weight = new int [N][2];
        int[] rank = new int[N];

        for(int i =0 ; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            weight[i][0] = Integer.parseInt(st.nextToken());
            weight[i][1] = Integer.parseInt(st.nextToken());
            rank[i] = 1;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0;  j< N; j++){
                if(i == j) continue;

                if(weight[i][0] < weight[j][0] && weight[i][1] < weight[j][1]){
                    rank[i] ++;
                }

                System.out.print("i :  "+ i+ "    "+  weight[i][0] + "    ");
                System.out.println("j :  "+ j+ "    "+ weight[j][0]);

                System.out.println("rank      " + rank[i]);


                System.out.println("=======================");
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(rank[i] + " ");
        }

     br.close();
    }
}

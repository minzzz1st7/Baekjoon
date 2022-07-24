package Alzalzal;

import java.io.IOException;
import java.util.Scanner;

public class BK10974_모든순열 {

    static int N;
    static boolean check[];
    static int ans[];
    static int num[];

    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        num = new int[N+1];
        ans = new int[N];
        check = new boolean[N+1];

        for(int i =1; i < N +1; i++){
            num[i] = i;
        }
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){

        if(depth == N){
            for(int i = 0; i < N; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }

        for(int i = 1; i < N +1 ; i++){
            if(!check[i]){
                check[i] = true;
                ans[depth] = num[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }





}

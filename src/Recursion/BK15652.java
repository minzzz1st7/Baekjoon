package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK15652 {
    static int ans[];
    static int M;
    static int N;

    public static void rec(int k, int l){
        if(k == M){
            for(int i = 0; i<M; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = l; i <N+1;i++){
            ans[k] = i;
            rec(k+1,i);
        }
    }

    /*
     *
     *
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = new int[M];
        rec(0,1);


    }
}

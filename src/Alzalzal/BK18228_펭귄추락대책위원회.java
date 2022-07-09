package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK18228_펭귄추락대책위원회 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] s = new int[N+1];
        int pg = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++){
            s[i]= Integer.parseInt(st.nextToken());
            if (s[i] == -1){
                pg = i;
            }
        }
        int minleft = Integer.MAX_VALUE;
        int minright = Integer.MAX_VALUE;

        for(int i = pg -1; i > 0; i-- ){
            minleft = minleft > s[i] ? s[i] : minleft;
        }

        for(int i = pg +1; i <= N; i++){
            minright = minright > s[i] ? s[i] : minright;
        }

        System.out.println(minleft + minright);
        br.close();
    }
}

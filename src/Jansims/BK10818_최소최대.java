package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



// if-if / else-if 의 차이
// 1번은 첫번째 if가 만족해도 100번째 if 까지 다 돌고
// 2번은 첫번째 if가 만족하면 else if는 실행되지 않는다.


// 내가 값을 한 개 넣었을 때, 예를 들면 1만 넣었을 때는 min, max 둘다 1 1 이어야 하는데
// max 에서 if 문 해결하고 else if 안에 있는 min 은 해결하지 못한다.
// 그래서 답과 다른 답이 나온다.
// 둘다 if 해줘야 함.

public class BK10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if ( max < num ) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        sb.append(min).append(" ").append(max);

        System.out.println(sb);


        br.close();

    }
}

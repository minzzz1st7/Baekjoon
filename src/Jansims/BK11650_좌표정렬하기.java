package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BK11650_좌표정렬하기 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Integer arr[][] = new Integer[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[0].equals(o2[0])){
                    return o1[1] - o2[1]; // x좌표가 같을 땐 y좌표로 정렬한다. (오름차순)
                } else {
                    return o1[0] - o2[0];
                }
            }

        });


        for(int i = 0 ; i < N; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }

        System.out.println(sb);

        br.close();

    }
}
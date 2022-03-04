package Jansims.Alzal;

/*
* arr과 sum배열을 따로 만들어줬다.
* 내가 전에 제출했던 내역을 보면,
* sum배열을 따로 만들지 않고 arr의 값을 전 인덱스와 더했던 값으로 변경해줬다.
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BK11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        int sum[] = new int [N+1];


        st = new StringTokenizer(br.readLine(), " ");
        for(int n = 1; n <= N; n++){
            arr[n] = Integer.parseInt(st.nextToken());
        } // 입력받아서 배열에 넣기

        Arrays.sort(arr);

        int total = 0;
        for(int n = 1; n <= N; n++){
            sum[n] = sum[n-1] + arr[n];
            total += sum[n];
        }

        System.out.println(total);

        br.close();
    }
}

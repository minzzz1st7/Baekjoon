package Mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bk1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[1000001];

        for(int i = 2; i <= N; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            if (i %3 ==0) arr[i] = Math.min(arr[i], arr[i/3]+1);
        }
        System.out.println(arr[N]);
    }
}

//어떤 수 n이 2의 배수 또는 3의 배수라면 배열에서 2 또는 3으로 나눈 몫의 인덱스의 값에 +1을 하면 n을 계산하는 최소 횟수.
// 2 또는 3의 배수가 아니라면, n-1 인덱스의 값에 +1을 하면 n을 계산하는 최소횟수.


package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BK2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr [] = new int[N];
        int sum = 0;
        int cnt [] = new int[8001];
        int mode = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            cnt[arr[i]+4000] ++;
        }

        // 산술평균
        System.out.println((int) Math.round((double)sum/N));


        // 중앙값
        Arrays.sort(arr);
        System.out.println(arr[N/2]);

        // 최빈값
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i < 8001; i++){
            if(cnt[i] == 0 ) continue;

            if(cnt[i] > max) {
                max = cnt[i];
                mode = i - 4000;
                flag = true;
            }

            else if (flag && max == cnt[i]){
                mode = i - 4000;
                flag = false;
            }
        }

        System.out.println(mode);

        // 범위
        System.out.println(arr[N-1] - arr[0]);

        br.close();
    }
}

package AprilAlog.Day0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1149_RGB거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][3];
        boolean check[][] = new boolean[N][3];

        for (int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i = 1; i < N; i++){
            arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
            System.out.println(arr[i][0]);
            System.out.println(arr[i][1]);
            System.out.println(arr[i][2]);
            System.out.println("=======================");


        }

        System.out.println(Math.min(arr[N-1][0], Math.min(arr[N-1][1], arr[N-1][2])));
        br.close();
    }
}

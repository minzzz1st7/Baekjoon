package Jansims;

import java.io.*;
import java.util.StringTokenizer;

// 배열을 100001 까지 주고 받아온 값을 인덱스로 설정해 값을 1로 해줬다.
// 나중에 받아온 값도 인덱스로 비교하면서 1이 있는 지 업는 지 찾아서 출력

public class BK1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int N2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int j = 0; j < N2; j++){
            Boolean possible = false;
            int temp = Integer.parseInt(st.nextToken());
            for(int i = 0; i < N; i++) {
                if (arr[i] == temp) {
                    bw.write(String.valueOf(1) + "\n");
                    possible = true;
                    break;
                }
            }
                if (!possible){
                    bw.write(String.valueOf(0)+ "\n");
                }



        }



        bw.flush();
        bw.close();
        br.close();
    } //main

}

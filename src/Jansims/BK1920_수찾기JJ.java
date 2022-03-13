package Jansims;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 배열을 100001 까지 주고 받아온 값을 인덱스로 설정해 값을 1로 해줬다.
// 나중에 받아온 값도 인덱스로 비교하면서 1이 있는 지 업는 지 찾아서 출력

public class BK1920_수찾기JJ {
    static int N;
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int N2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i< N2; i++){
            if(binarySearch(Integer.parseInt(st.nextToken()))){
                bw.write(String.valueOf(1)+"\n");
            }else{
                bw.write(String.valueOf(0)+"\n");
            }




        }




        bw.flush();
        bw.close();
        br.close();
    }


    public static boolean binarySearch(int a){
        int start = 0;
        int end = N-1;
        while(start <= end){
            int mid = (end+start)/2;
            if (arr[mid] == a) {
                return true;
            }
            else if( a > arr[mid]) {
                start = mid+1;
            } else{
                end = mid -1;
            }

    }
        return false;
    }


}

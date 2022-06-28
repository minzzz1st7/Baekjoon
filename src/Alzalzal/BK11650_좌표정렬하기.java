package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BK11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(arr, new Comparator<int[]>(){

            @Override
            // o2가 먼저 들어와있는 수인
            public int compare(int[] o1, int[] o2) {

                System.out.println("=================================");
                System.out.println("compare 호출 얼마나 되는지?");
                System.out.println(arr[0][0]+ "  " + arr[0][1]);;
                System.out.println(arr[1][0]+ "  " + arr[1][1]);;
                System.out.println(arr[2][0]+ "  " + arr[2][1]);;
                System.out.println(arr[3][0]+ "  " + arr[3][1]);;
                System.out.println(arr[4][0]+ "  " + arr[4][1]);;

                // x좌표의 값이 같다면 y좌표를 기준으로 정렬
                if(o1[0] == o2[0]){
                    System.out.println("여긴 If 문!!");
                    System.out.println("o1[0]  o2[0]" + o1[0] +" "+ o2[0]);
                    System.out.println("o1[1]  o2[1]" + o1[1] +" "+ o2[1]);
                    // 새로 들어온 o1이 두번째 값이 더 크면, 양수가 나오겠지 그리고 뒤로 가겠지
                    return o1[1]-o2[1];
                }

                // 나머지는 x좌표를 기준으로 정렬
                else {
                    System.out.println("여긴 else 문!!");
                    System.out.println("o1[0]  o2[0]" + o1[0] +" "+ o2[0]);
                    return o1[0]-o2[0];
                }

            }
        });

        for(int[] list : arr){
            sb.append(list[0] + " "+list[1]).append("\n");
        }

        System.out.println(sb);




    }

}

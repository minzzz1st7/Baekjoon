package Jansims;

import java.util.Arrays;
import java.util.Scanner;

public class BK15657_N과M8 {

    static int arr[], select[];
    static StringBuilder sb;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb= new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[N];
        select = new int[M];
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        dfs(0, 0 );

        System.out.println(sb);
        sc.close();
    }


    public static void dfs(int start, int count ){

        System.out.println("dfs 들어옴 "+ start + " "+ count);
        // 경계
        if(count == select.length){
            System.out.println("경계 들어옴");
            for(int num : select){
                System.out.print(num +" ");
                sb.append(num).append(" ");
            }
            System.out.println();
            sb.append('\n');
            return;
        }

        // 재귀
        for (int i = start; i < arr.length; i++){
            System.out.println("재귀 들어옴 ");
            select[count] = arr[i];

            dfs(i, count + 1);
        }


    }
}

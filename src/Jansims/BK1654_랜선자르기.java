package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BK1654_랜선자르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long N = sc.nextLong();
        long[] arr = new long[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextLong(); // 802 743 457 539
            max = Math.max(max, arr[i]);

        }

        // 이분탐색
        long left = 1; //랜선길이는 자연수므로  최솟값 1로 세팅해야함
        long right = max;
        while (left <= right) {
            long mid = (left + right) / 2;
            System.out.println("mid "+ mid);
            long sum = 0;
            for (int i = 0; i < K; i++) { // 자른 개수 합
                sum += (arr[i] / mid);
                System.out.println("arr[i] "+ arr[i]);
                System.out.println("sum입니다 " + sum);
            }
            System.out.println("--------------------");
            if (sum >= N) { //더 많은 랜선 나온 경우 더 크게 잘라줘야함
                System.out.println("더 많은 랜선이 나왔어요! ");
                left = mid + 1;
                System.out.println("left: "+ left);
            } else {

                System.out.println("더 적은 랜선이 나왔어요! ");
                right = mid - 1;
                System.out.println("right: "+ right);
            }
        }
        System.out.println(right);
    }
}

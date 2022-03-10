package Jansims;

import java.util.Scanner;

/*
N부터 1까지 반복문 돌면서 각 자리수의 합을 구해
N과 일치하는 해당값을 구하꼬 했다.
어쨌든 반복문을 끝까지 돌면서 가장 작은 생성자를 구하려고 했다.


못 푼 이유는 각 자리수를 구하지 못해서


* */

public class BK2231_분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        // 나는 N부터 계산했는데 0부터 하는 게 좋다
        // 더 작은 생성자를 출력하라고 했으니까

        int result = 0;
        for(int i = 0; i < N ; i++){

            int sum = 0;
            int num = i;

            while(num != 0){
                sum += num % 10;
                num = num/10;
            }

            if( i + sum == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }

}

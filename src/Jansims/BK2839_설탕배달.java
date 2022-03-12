package Jansims;

import java.util.Scanner;

public class BK2839_설탕배달 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        while( N > 0){

            if( N % 5 == 0 ){
                cnt += N/5;
                break;
            } else {
                N -= 3;
                cnt ++;
            }

            if( N < 0) {
                cnt = -1;
            }
        }

        System.out.println(cnt);
        sc.close();
    }

}

package Jansims;

import java.util.Scanner;

public class BK1463_1로만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        while( N > 1){

            if( N % 3 == 0){
                N /= 3;
                cnt ++;

                if( N ==1 ) break;
            }

            else{
                N = N -1;
                cnt ++;

                if(N ==1 ) break;
            }

            if( N % 2 == 0){
                N /= 2;
                cnt ++;

                if( N ==1 ) break;
            }
        }
        System.out.println(cnt);

    }
}

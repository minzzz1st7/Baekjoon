package Jansims;

import java.util.Scanner;

public class BK2609_최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int D = gcd(N, M); //최대공약수

        System.out.println(D);
        System.out.println(N * M / D);

        sc.close();

    }

    public static int gcd(int N, int M){
        if(M == 0) return N;

        return gcd(M, N % M);
    }
}

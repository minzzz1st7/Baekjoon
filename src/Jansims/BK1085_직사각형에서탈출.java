package Jansims;

import java.util.Scanner;

public class BK1085_직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int min1 = Math.min(x, w-x);
        int min2 = Math.min(y, h-y);

        int Min = Math.min(min1, min2);
        System.out.println(Min);
        sc.close();
    }
}

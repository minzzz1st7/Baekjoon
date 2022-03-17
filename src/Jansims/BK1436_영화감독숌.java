package Jansims;

import java.util.Scanner;
// 3개가 연속하는 수가 다음 것
// 66600 66601 66602 도 가야함
// 처음 생각처럼 1000씩 더하는 게 아니라

public class BK1436_영화감독숌{
    static String triple = "666";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        int num = 666;

        while(true){
            if(isRignt(num)) cnt++;
            if(cnt == N) break;
            num++;
        }
        System.out.println(num);


    }
    public static boolean isRignt(int num) {
        String s = Integer.toString(num);
        if(s.contains(triple)) return true;
        else return false;
    }
}

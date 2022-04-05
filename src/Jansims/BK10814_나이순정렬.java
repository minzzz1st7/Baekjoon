package Jansims;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BK10814_나이순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] str = new String[N][2];

        for(int i = 0; i < N; i++) {
            str[i][0] = sc.next();
            str[i][1] = sc.next();
        }

        //나이 순 -> 같으면 가입 순
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);

            }
        });

       
        for(int i = 0; i < N; i++) {
            System.out.println(str[i][0] + " " + str[i][1]);
        }
    }

}

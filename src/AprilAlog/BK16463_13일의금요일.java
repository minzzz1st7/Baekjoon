package AprilAlog;

import java.util.Scanner;

public class BK16463_13일의금요일 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        // 0: Sun, 1: Mon, 2: Tues, 3: Wed, 4: Thur, 5: Fri, 6: Sat
        int start = 2;
        int cnt = 0;
        for(int year = 2019; year <= N; year++){
            for(int month = 1; month <=12; month++) {
                if ((start + 12) % 7 == 5) {
                    cnt++;
                }

                if( month==2 && (year % 400 == 0 || (year % 100 != 0 && year % 4 ==0))){
                    start++;
                }
                start = (start+day[month]) % 7;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}

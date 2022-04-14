package AprilAlog.Day0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5604_JJ1구간합 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine(), " ");
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            long sum = 0;

            if( A < 10 &&  B < 10){
                for(long i = A; i <= B; i++){
                    sum += i;
                }
            }

            else if ( A < 10 && B >= 10){
                for(long i = A; i < 10; i++){
                    sum += i;
                }

                for(long  b = 10; b <= B; b++){
                    sum += b % 10;
                    sum += b / 10;
                }
            }

            else if ( A >= 10 && B >= 10) {
                for(long  b = A; b <= B; b++){
                   // System.out.println("b 증가해서 while 다시 갔니???   "+ b);
                    long num = b;
                    while(true){
                        sum += num % 10;
                        num =  num / 10;

                        if ( num > 0 && num < 10){
                            sum += num;
                            break;
                        }
                    } //while
                } //for
            }

            sb.append("#").append(t).append(" ").append(sum).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}

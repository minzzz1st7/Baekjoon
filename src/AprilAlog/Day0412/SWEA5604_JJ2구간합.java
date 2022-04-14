package AprilAlog.Day0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA5604_JJ2구간합 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine(), " ");
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            long sum = 0;

            for(long i= A; i <= B; i++){
                    long num = i;
                    while(true){
                        if( num < 10){
                            sum += num;
                            break;
                        }
                        else {
                            sum += num % 10;
                            num =  num / 10;

                            if ( num > 0 && num < 10){
                                sum += num;
                                break;
                            }

                        }

                    } //while
                }
             System.out.println("#"+t+" "+sum);
            }

        br.close();
        }


}

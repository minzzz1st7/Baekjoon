package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://loosie.tistory.com/233
public class BK2602_돌다리건너기 {
    static String[] str,dev,ang;
    static int[][][] dp;
    static int len;
    static int index = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split("");
        dev = br.readLine().split("");
        ang = br.readLine().split("");

        len = dev.length;
        dp = new int[str.length+1][len+1][2];


        for(int i=0; i<2; i++) {
            for(int j=0; j<len; j++) {
                for(int k=0; k<str.length; k++) {
                    dp[k][j][i] = -1;
                }
            }
        }

        int dev_start = dfs(0,0,0);
        int ang_start = dfs(0,0,1);
        System.out.println(dev_start+ ang_start);

    }

    // pos : 현재 건너는 str위치
    // idx : 천사/악마 dev, ang 위치
    // turn : 1== 악마, 0== 천사
    static int dfs(int pos, int idx, int turn){
        System.out.println("======== index "+index+" ========   ");
        System.out.println("pos는   "+ pos + "   idx는   "+ idx + "   turn   "+ turn);
        index++;
        if(pos == str.length) {
            return 1;
        }
        if(dp[pos][idx][turn] != -1) {
            System.out.println("dp에 들어왔어용~~~~" + dp[pos][idx][turn]);

            return dp[pos][idx][turn];
        }
        int count =0;
        if(turn==0) { // 악마
            for(int i=idx; i<len; i++) {
                if(str[pos].equals(dev[i])) {
                    count += dfs(pos+1, i+1, 1);
                    System.out.println("count "+ count);
                }
            }
        }
        else { // 천사

            for(int i=idx; i<len; i++) {
                if(str[pos].equals(ang[i])) {
                    count += dfs(pos+1, i+1, 0);
                    System.out.println("count "+ count);
                }
            }
        }
        return dp[pos][idx][turn] = count;
    }
}

package AprilAlog.Day0331;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1149_RGB거리 {
    static int N;
    static int D[][] = new int[1001][3];
    static int Answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        N = Integer.valueOf(br.readLine());
        String input = null;
        StringTokenizer st = null;
        for (int i = 1; i <= N; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            D[i][0] = Integer.valueOf(st.nextToken());
            D[i][1] = Integer.valueOf(st.nextToken());
            D[i][2] = Integer.valueOf(st.nextToken()); }
        // 처리
        for (int i = 1; i <= N; i++) {
            D[i][0] = D[i][0] + Math.min(D[i-1][1], D[i-1][2]);
            D[i][1] = D[i][1] + Math.min(D[i-1][0], D[i-1][2]);
            D[i][2] = D[i][2] + Math.min(D[i-1][0], D[i-1][1]);
        }
        Answer = Math.min(D[N][0], D[N][1]);
        Answer = Math.min(Answer, D[N][2]);
        // 출력
        System.out.println(Answer);
       }

}

package AprilAlog.Day0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JG2577_회전초밥 {
    static int N, D, K, C, size = 0;
    static final int MOD = 100003, KEY = 5381;
    static int[] list, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        D = stoi(st.nextToken());
        K = stoi(st.nextToken());
        C = stoi(st.nextToken());
        init();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list[i] = (stoi(st.nextToken()));
        }

        System.out.println(calc());
    }

    private static int calc() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                add(C);
                for (int k = 0; k < K; k++) {
                    add(list[k]);
                }
            } else {
                remove(list[i - 1]);
                add(list[(i + K - 1) % N]);
            }
            max = Math.max(max, size);
        }
        return max;
    }

    private static void add(int num) {
        if (count[num]++ == 0) size++;
    }

    private static void remove(int num) {
        if (--count[num] == 0) size--;
    }

    private static void init() {
        list = new int[N];
        count = new int[D + 1];
    }

    private static int stoi(String input) {
        return Integer.parseInt(input);
    }



}

package AprilAlog.Day0404;

import java.awt.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class SWEA1767_프로세서연결하기 {
    // 연결하지 않는 경우도 생각
    static int[] dr = { -1, 0, 1, 0, 0 };
    static int[] dc = { 0, 1, 0, -1, 0 };
    static int[][] map;
    static int N, Tc;
    static ArrayList<Point> arr = new ArrayList<>();
    static int core_count = 0;
    static PriorityQueue<answer> ans = new PriorityQueue<>();


    public static class answer implements Comparable<answer> {
        int count;
        int sum;

        public answer(int count, int sum) {
            this.count = count;
            this.sum = sum;
        }

        @Override
        public int compareTo(answer o) {
            // TODO Auto-generated method stub
            if (this.count > o.count) {
                return -1;
            } else if (this.count < o.count) {
                return 1;
            } else {
                return this.sum - o.sum;
            }
        }

    }
}

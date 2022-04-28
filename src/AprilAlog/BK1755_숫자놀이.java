package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1755_숫자놀이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = M; i <= N; i++){
            String s = " ";

            if  (i < 10) {
                s += num[i];
            }

            else {
                s += num[i/10];
                s += " ";
                s += num[i%10];
            }

        }





    }

    static class Node implements Comparable<AprilAlog.Node>{
        int num;
        String word;

        public Node()


        @Override
        public int compareTo(AprilAlog.Node o) { // 문자열 순서대로 정렬하기
            return 0;
        }
    }


}



package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BK1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String ss = br.readLine();
            if(ss.equals("0")){
                break;
            }

            String s[] = ss.split("");
            String left = "";
            String right = "";


            if(s.length % 2 == 0){
                int N = s.length/2 - 1;
                for(int i = 0; i <= N; i++){
                    left += s[i];
                }
                for(int j = s.length-1; j > N; j--){
                    right += s[j];
                }

                if(left.equals(right)){
                    sb.append("yes").append("\n");
                }
                else {
                    sb.append("no").append("\n");
                }

            }
            else {
                int N = s.length /2;

                for(int i = 0; i < N; i++){
                    left += s[i];
                }
                for(int j = s.length-1; j > N; j--){
                    right += s[j];
                }

                if(left.equals(right)){
                    sb.append("yes").append("\n");
                }
                else {
                    sb.append("no").append("\n");
                }

            }
        }
        System.out.println(sb);

    }
}

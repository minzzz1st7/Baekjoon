package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BK1259_팰린드롬수GG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        while(true){
            String s = br.readLine();
            if(s.equals("0")){
                break;
            }
            list.add(s);
        }

        for(String f : list){
            String ans = "yes";
            int N = f.length()/2;
            String[] ss = f.split("");

            for(int i = 0; i < N; i++){
                if(!ss[i].equals(ss[f.length() - 1 - i])){
                    ans = "no";
                    break;
                }
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}

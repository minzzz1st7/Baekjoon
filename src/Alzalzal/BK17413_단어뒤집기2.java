package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BK17413_단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String arr[] =  new String[100001];
        String s = br.readLine();

        arr = s.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();


        boolean check = false;
        for(String kk :  arr){


            if(kk.equals(">")){
                //System.out.println("들어왔니");
                check = false;
                queue.add(kk);
                int N = queue.size();
                for(int i = 0; i < N; i++){
                    String sta = queue.poll();
                    sb.append(sta);
                }
            }

            else if(kk.equals("<") || check){
                //System.out.println("들어왔니");

                if(!stack.isEmpty()){
                    int stacksize = stack.size();
                    for(int i = 0; i < stacksize; i++){
                        sb.append(stack.pop());
                    }
                }
                check = true;
                queue.add(kk);
            }
            else if(kk.equals(" ")){

                if(!stack.isEmpty()){
                    int stacksize = stack.size();
                    for(int i = 0; i < stacksize; i++){
                        sb.append(stack.pop());
                    }
                }
                sb.append(" ");
            }
            else {
                stack.add(kk);
            }
        }

        if(!stack.isEmpty()){
            int stacksize = stack.size();
            for(int i = 0; i < stacksize; i++){
                sb.append(stack.pop());
            }
        }

        System.out.println(sb);

        br.close();
    }
}

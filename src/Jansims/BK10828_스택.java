package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BK10828_스택 {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;

     int N = Integer.parseInt(br.readLine());

     Stack <Integer> stack = new Stack<>();
     for(int i = 0; i < N; i++){
         st = new StringTokenizer(br.readLine()," ");
         String Ins = st.nextToken();

         if(Ins.equals("push")){
             int num = Integer.parseInt(st.nextToken());
             stack.push(num);
         }

         else if(Ins.equals("top")){
             if(stack.isEmpty()){
                 System.out.println(-1);
             } else {
                 System.out.println(stack.get(stack.size()-1));
             }
         }

         else if(Ins.equals("size")){
             System.out.println( stack.size());
         }
         else if(Ins.equals("pop")){
             if(stack.isEmpty()){
                 System.out.println(-1);
             } else{
                 System.out.println(stack.pop());
             }
         }
         else if(Ins.equals("empty")){
             if(stack.isEmpty()){
                 System.out.println(1);
             } else {
                 System.out.println( 0);
             }
         }
     }
     br.close();
    }
}

package Jansims;

import java.util.*;
import java.io.*;
import java.util.Stack;

// https://velog.io/@lifeisbeautiful/Java-%EB%B0%B1%EC%A4%80-9012%EB%B2%88-%EA%B4%84%ED%98%B8-%EC%9E%90%EB%B0%94
public class BK9012_GG괄호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            int length = str.length();

            for(int j=0; j<length; j++) {
                char ch = str.charAt(j);

                if(ch == '(') {
                    stack.push(ch);
                }
                else {
                    int size = stack.size();
                    if(size == 0) {
                        stack.push(ch);
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            stack.clear();
        }
    } // End Main
} // End Class
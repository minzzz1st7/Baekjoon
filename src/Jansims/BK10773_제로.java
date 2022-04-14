package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 놀라운 사실!!!
// 반복문의 조건을 stack.size()로 해놓고 안에서 pop하면
// stack 크기가 줄어서 다음 반복문 때 조건문이 달라진다.
public class BK10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            if( n == 0 ){
                stack.pop();
            } else {
                stack.push(n);

            }
        }
        int size = stack.size();

        int sum = 0;
        for(int j = 0; j < size; j++){
           sum += stack.pop();
        }

           System.out.println(sum);
    }


}

package Jansims;

import java.io.*;

class Stack {

    private int top;
    private int stackArr[];

    public Stack(int size){
        this.top = -1;
        this.stackArr = new int[size];
    }

    //push
    public void push(int x){
        this.stackArr[++top] = x; // -1인 top의 위치를 증가시킨 후 삽입
    }

    // 조회하고 값도 빼기
    public int pop(){
        if(top == -1) return -1;
        return this.stackArr[top--]; // 원소가 있으면 값을 반환 후, top 값을 감소
    }

    public int size(){
        return this.top + 1; // 원소가 1개 있을 때 top이 0이니까 +1 후 리턴
    }

    public int empty(){
        if(top == -1 ){
            return 1;
        } else return 0;
    }
    // 조회
    public int top(){
        if( top == -1) return -1;
        else return this.stackArr[top];
    }
}


public class BK10828_스택_JJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 명령어 수.
        int n = Integer.parseInt(br.readLine());

        // 명령어 수 크기의 Stack 객체 생성.
        Stack stack = new Stack(n);

        // 명령어 수만큼 반복.
        for(int i = 0;i<n;i++) {
            // 명령어 입력.
            String cons = br.readLine();

            if(cons.contains("push")) { // push 명령어
                String spt[] = cons.split(" "); // 공백 기준 분할.
                stack.push(Integer.parseInt(spt[1])); // 분할된 정수를 push.
            }else if(cons.contains("pop")) { // pop 명령어
                bw.write(String.valueOf(stack.pop())+"\n");
            }else if(cons.contains("size")) { // size 명령어
                bw.write(String.valueOf(stack.size())+"\n");
            }else if(cons.contains("empty")) { // empty 명렁어
                bw.write(String.valueOf(stack.empty())+"\n");
            }else if(cons.contains("top")) { // top 명령어
                bw.write(String.valueOf(stack.top())+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

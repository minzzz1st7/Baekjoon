package Jansims;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 꺅 한번에 성공!!!
// arr로 했다가 arraylist로 했다가 고민했는데
// queue를 생각해보니 문제에 맞을 것 같았다.


public class BK2164_카드2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++){
           queue.add(i);
        } // 입력값 큐에 넣기

       while(queue.size() >1){

           queue.remove();

           if(queue.size() == 1)break;
           int n = queue.poll();
           queue.add(n);
       }

        System.out.println(queue.poll());
         sc.close();

    }
}

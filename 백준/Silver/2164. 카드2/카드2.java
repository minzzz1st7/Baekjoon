import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++){
           queue.add(i);
        } // 입력값 큐에 넣기

        int index ;
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

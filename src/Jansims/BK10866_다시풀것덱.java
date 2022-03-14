package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BK10866_다시풀것덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < N; i++){


            String s = br.readLine();
            if(s.contains("push_back")){
                String[] arr = s.split(" ");
                deque.addLast(Integer.parseInt(arr[1]));

            }


            else if(s.contains("push_front")){
                String[] arr = s.split(" ");
                deque.addFirst(Integer.parseInt(arr[1]));
            }


            else if(s.contains("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(deque.peekFirst()).append("\n");
                }
            }


            else if(s.contains("back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(deque.peekLast()).append("\n");
                }
            }

            else if(s.contains("size")){
                sb.append(deque.size()).append("\n");
            }



            else if(s.contains("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }



            else if(s.contains("pop_front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            }



            else if(s.contains("pop_back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");

                }
            }


        }

        System.out.println(sb);
        br.close();
    }

}

package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



/*
* 스택문제랑 비슷하게 풀었고 출력방식을 StringBuilder를 사용했다.
* back을 어려워했는데, 구글링해서 해결했다.
* push에서 값을 back이라는 변수에 저장해서
* back이 들어오면 그냥 최근에 입력받은 back 값을 출력하는 걸로 해결
*
* 다른 문제는 케이스문 사용, 삼항연산자 사용
*
* */
public class BK10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int back = -1;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if( s.equals("push")){
                back = Integer.parseInt(st.nextToken());
                queue.add(back);
            }

            else if (s.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            }
            else if(s.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(back).append("\n");
                }
            }

            else if(s.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if (s.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if(s.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else{
                    sb.append(queue.peek()).append("\n");
                    queue.poll();
                }
            }
        }
        System.out.println(sb);

        br.close();
    }
}

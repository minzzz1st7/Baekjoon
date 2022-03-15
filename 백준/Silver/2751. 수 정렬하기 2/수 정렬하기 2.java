import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringBuilder sb = new StringBuilder();


     int N = Integer.parseInt(br.readLine());

     PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

     for (int n = 0; n < N; n++){
         heap.add(Integer.parseInt(br.readLine()));
     }


     for(int i = 0; i < N; i++){
        sb.append(heap.poll()).append("\n");
     }
     System.out.println(sb);



     br.close();
    }
}

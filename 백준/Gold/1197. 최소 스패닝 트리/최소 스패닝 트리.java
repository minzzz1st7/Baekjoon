import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/* 연결된 간선 중 항상 가장 비용이 작은 간선을 택하면서 vertex를 고르는 것이 핵심이므로 priorityQueue를 사용
* PriorityQueue를 사용하기 위해서는 Comparable이 구현되어 있어야 하므로 value를 기준으로 하는 Node 클래스 생성
* */
public class Main{
    static int V;   //정점의 개수
    static int E;   //간선의 개수
    static boolean[] visited; //방문 관리
    static ArrayList<Node>[] adj;   // 인접 리스트
    static PriorityQueue<Node> pq;  // 우선순위 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());   // 정점의 개수
        E = Integer.parseInt(st.nextToken());   // 간선의 개수

        // 인접 리스트 생성
        adj = new ArrayList[V+1];
        for (int i = 1; i <= V; i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());


            // 인접 리스트
            adj[from].add(new Node(to, value));
            adj[to].add(new Node(from, value));

        }

        System.out.println(prim());



    }

    private static int prim() {

        int ret = 0;
        visited = new boolean[V+1];
        pq = new PriorityQueue<Node>(); // 우선 순위 큐
        pq.add(new Node(1, 0));

        int cnt = 0;
        while (!pq.isEmpty()){

            Node edge = pq.poll();

            // 이미 방문한 정점인 경우
            if(visited[edge.to]){
                continue;
            }


            ret += edge.value;
            visited[edge.to] = true;

            // 모든 노드를 방문한 경우
            if (++cnt == V){
                return ret;
            }


            // 연결된 노드들 중 방문하지 않은 노드 탐색
            for (int i = 0 ; i < adj[edge.to].size(); i++){

                Node next = adj[edge.to].get(i);
                if (visited[next.to]){
                    continue;
                }

                pq.add(next);
            }
        }

        return ret;
    }

}
    class Node implements Comparable<Node> {
        int to;
        int value;


        public Node(int to, int value) {
            this.to = to;
            this.value = value;
        }

        @Override
        public int compareTo(Node o){
            return o.value >= this.value ? -1 : 1;
        }
    }



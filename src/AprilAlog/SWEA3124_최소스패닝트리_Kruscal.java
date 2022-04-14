package AprilAlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA3124_최소스패닝트리_Kruscal {
    static int V; // 정점의 갯수
    static int E; // 간선의 갯수
    static int[] parent;
    static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken()); // 정점의 갯수
        E = Integer.parseInt(st.nextToken()); // 간선의 갯수


        System.out.println("여기는 메인~~~~~~~");
        make();
        System.out.println("parent[1]을 찍어보셈~~~"+ parent[1]);
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        } // End of input
        System.out.println(Kruscal());
    }

    private static int Kruscal() {
        System.out.println("여기는 크루스칼 메서드 ~~~~~~~~");
        int ret = 0;
        int cnt = 0;

        while (!pq.isEmpty()) {
            Edge temp = pq.poll();

            int a = find(temp.start);
            int b = find(temp.end);

            // 사이클이 생기므로 continue.
            if (a == b) {
                continue;
            }

            union(a, b);
            ret += temp.value;
            if (++cnt == V) {
                break;
            }
        }

        return ret;
    }

    // 상위 노드 초기화
    private static void make() {
        System.out.println("여기는 make() ~~~~~~");
        parent = new int[V + 1];
        for (int i = 1; i < V + 1; i++) {
            parent[i] = i;
        }

    }

    // union find
    private static int find(int a) {
        System.out.println("여기는 find() ~~~~~");
        if (a == parent[a]) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }

    private static void union(int a, int b) {
        System.out.println("여기는 union()~~~~~~~");
        // 최상위 노드 탐색
        int aRoot = find(a);
        int bRoot = find(b);

        // 최상위 노드가 같지 않은 경우
        if (aRoot != bRoot) {
            parent[aRoot] = bRoot;
            System.out.println(aRoot + "     "+ bRoot);
            System.out.println("=====================");
        } else {
            return;
        }
    }

}

class Edge implements Comparable<Edge> {
    int start;
    int end;
    int value;

    public Edge(int start, int end, int value) {
        this.start = start;
        this.end = end;
        this.value = value;
    }

    @Override
    public int compareTo(Edge o) {
        return o.value >= this.value ? -1 : 1;
    }



}

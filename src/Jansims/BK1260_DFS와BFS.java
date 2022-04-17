package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK1260_DFS와BFS {

    static int N, M, V;
    static ArrayList<Integer>[] graph;
    static boolean isVisit[] ;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());


        graph = new ArrayList[N + 1];
        isVisit = new boolean[N + 1];
        for (int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        } // 간선 연결 상태 저장

        for (int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine()," ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from].add(to);
            graph[to].add(from);

        } // 그래프 만들기

        for(int i = 1; i < graph.length; i++){
            Collections.sort(graph[i]);
        }

        dfs(V);
        isVisit = new boolean[N+1];
        sb.append('\n');
        bfs(V);

        System.out.println(sb);

        br.close();
    }

    static void dfs(int index){
        isVisit[index] = true;
        sb.append(index + " ");

        for(int i : graph[index]){
            if (!isVisit[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int index){
        isVisit[index] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(index);

        while (!q.isEmpty()){
            int a = q.poll();
            sb.append(a + " ");

            for (int i : graph[a]){
                if(!isVisit[i]){
                    q.add(i);

                    isVisit[i] = true;
                }
            }
        }
    }


}

package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BK1260_DFS와BFS {

    static int N, M, V;
    static int A1, A2;
    static boolean visited[] = new boolean[1001]; //노드 방문했는지 확인하기 위한 변수
    static int arr[][]; // 주어진 노드들의 관계를 저장하는 배열
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[M+1][M+1];

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            A1 = Integer.parseInt(st.nextToken());
            A2 = Integer.parseInt(st.nextToken());
            arr[A1][A2] = arr[A2][A1] = 1;
        }


        dfs(V);
        Arrays.fill(visited, false);

        sb.append("\n");

        bfs(V);
        Arrays.fill(visited, false);
        System.out.println(sb);

    }

    public static void dfs(int v){
        visited[v] = true;
        sb.append(v).append(" ");

        for(int i = 1; i <= M; i++){
            if(arr[v][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        q.add(v);
        visited[v] =true;

        while(!q.isEmpty()){
            int p = q.poll();
            sb.append(p + " ");

            for(int i = 1; i <= M; i++){
                if(arr[p][i] == 1 & !visited[i]){
                    q.add(i);
                    visited[i] = true;

                }
            }
        }

    }
}

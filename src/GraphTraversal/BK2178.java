package GraphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BK2178 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());  //행
        m = Integer.parseInt(st.nextToken());  //열

        map = new int[n][m]; // 미로 지도
        visited = new boolean[n][m]; // 방문 여부
        visited[0][0] = true;

        for(int i = 0; i < n; i++){

            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            System.out.println(str);
            for(int j =0; j < m; j++) {
                map[i][j] = str.charAt(j)-'0';
                //System.out.print(map[i][j]);
            }
            //System.out.println();
        }

       // search(0,0);
        System.out.println(map[n-1][m-1]);

    }


}

/*https://hwisaek.tistory.com/entry/%EB%B0%B1%EC%A4%80-2178%EB%B2%88-%EB%AF%B8%EB%A1%9C%ED%83%90%EC%83%89-Java*/
package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BK1018_체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int index = 0;
        String[][] chess = new String[N][M];
        boolean check = false;
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j< N; j++) {
                chess[i]= s.split("");

                if(chess[i][j].equals("W")) check = true;

                for(index = 0; index < 4; index++){
                    int nextX = i + dx[index];
                    int nextY = j + dy[index];

                    if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
                        if (chess[nextX][nextY].equals(chess[i][j])) {
                            System.out.println("같아요!");
                            if (check == true) chess[nextX][nextY] = "B";
                            else chess[nextX][nextY] = "W";
                        }
                    } else break;
                }
            }
        }

        br.close();
    }

}

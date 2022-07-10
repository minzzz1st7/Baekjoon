import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N, M;
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0 , 1, 0 ,-1};
    static int X = 0, Y = 0;
    static int next =0;

    static int arr[][];
    static boolean check[][];
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        check = new boolean[N][N];

        int ansX = 0;
        int ansY = 0;

        board();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]).append(" ");
                if(arr[i][j] == M){
                    ansX = i+1;
                    ansY = j+1;
                }
            }
            sb.append("\n");
        }

        sb.append(ansX + " " + ansY);

        System.out.println(sb);
    }

    public static void board(){
        for(int i = N * N; i >0 ; i--){

            arr[X][Y] = i;
            check[X][Y] = true;

            X = X+ dx[next % 4];
            Y = Y+ dy[next % 4];

            if( X < 0 || X > N-1 || Y < 0 || Y > N -1 || check[X][Y] == true){
                X = X- dx[next % 4];
                Y = Y- dy[next % 4];
                next ++;
                X = X+ dx[next % 4];
                Y = Y+ dy[next % 4];
            }

        }
    }
}

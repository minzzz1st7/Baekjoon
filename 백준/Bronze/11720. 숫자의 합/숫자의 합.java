import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String[] ss = str.split("");
        int sum = 0;

        for(int i= 0 ; i < N; i++){
            sum += Integer.parseInt(ss[i]);
        }

        System.out.println(sum);

        br.close();
    }
}

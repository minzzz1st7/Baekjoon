import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                String arr[] = s.split("");
                Stack<String> stack = new Stack<>();

                for(int k = 0; k < arr.length; k++ ){
                    stack.push(arr[k]);
                }


                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }

                sb.append(" ");
            } sb.append("\n");

        }

        System.out.println(sb);
        br.close();

    }
}

package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 이렇게 풀면 같은 단어들은 제대로 출력이 안된다.
public class BK1181_단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[51];
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            arr[s.length()] = s;
        }

        for(int j = 0; j < 50; j++){
            if(arr[j] != null){
                sb.append(arr[j]).append('\n');

            }
        }

        System.out.println(sb);


        br.close();
    }

}

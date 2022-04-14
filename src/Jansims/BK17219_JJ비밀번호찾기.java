package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


// hashMap은 containsKey로 찾으면 boolean 값이라서 안될 듯...
// 2차원 배열 쓰고 , 해당 행에 있는 값 찾아줘야 할 듯...

public class BK17219_JJ비밀번호찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> hashMap = new HashMap<String, String>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            hashMap.put(st.nextToken(), st.nextToken());
        }


        for(int j = 0; j < M; j++){
            String s = br.readLine();
            if(hashMap.containsKey(s)){
                sb.append(hashMap.get(s)).append("\n");
            }
        }

        System.out.println(sb);
    br.close();
    }


}

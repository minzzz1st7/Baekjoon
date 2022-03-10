package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BK1764_듣보잡_JJ {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] name = new String[N];
        for(int i = 0; i < N; i++){
            name[i] = br.readLine();

        }
        int cnt = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(int j= 0 ; j < M; j++){
            String see = br.readLine();
            for(int i= 0 ; i < N; i++){
                if(name[i].equals(see)){
                    arr.add(see);
                    cnt++;
            }

            }
        }
        //Collections.sort(arr);
        arr.sort(String::compareToIgnoreCase);

        System.out.println(cnt);
        for(String x : arr){
            System.out.println(x);
        }


     br.close();
    }
}

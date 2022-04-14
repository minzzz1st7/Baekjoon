package AprilAlog.Day0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BK1939_중량제한 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            graph.put(1,new ArrayList<Integer>(Arrays.asList(3,4)));
            graph.put(3,new ArrayList<Integer>(Arrays.asList(3,4)));
            System.out.println(graph.get(1).get(1));



        }


//        for ( int i = 0; i < N; i++){
//            st = new StringTokenizer(br.readLine()," ");
//
//        }

        br.close();
    }

}

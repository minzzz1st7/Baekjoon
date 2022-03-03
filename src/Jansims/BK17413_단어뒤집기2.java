package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BK17413_단어뒤집기2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()){

            String s = st.nextToken();
            String temp = "";
            String arr[]= s.split("");
            for(int i = 0 ; i < arr.length/2; i++){
                if(arr[i].equals("<") || arr[i].equals(">")) {


                    break;
                }
                temp = arr[i];
                arr[i] = arr[arr.length -i -1];
                arr[arr.length-i-1] = temp;
            }

            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]);
            } sb.append(" ");

        }
        System.out.println(sb);

        br.close();

    }


}

package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK21966_중략 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String str[] = s.split("");

        for(int i = 0; i < str.length; i++){
            if(str[i].equals(".") && str.length < 26 ){
                sb.append(s);
            }
            else if (str[i].equals(".")){
                for(int j = 0 ; j < 9 ; j++){
                    sb.append(str[j]);
                }
                sb.append("......");
                for(int k = str.length - 12; k < str.length; k ++){
                    sb.append(str[k]);
                }
            }
            else if (str.length > 25){

            }

        }


        br.close();
    }
}

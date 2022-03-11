package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BKK2292_벌집 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int cut=1;
        int stop=1;
        if(N==1) {
            cut=1;
        }else {
            while(N>stop) {
                stop=(cut*6)+stop;
                cut++;
            }
        }
        System.out.print(cut);
    }

}

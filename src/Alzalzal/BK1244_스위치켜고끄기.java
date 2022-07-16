package Alzalzal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BK1244_스위치켜고끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String str[] = new String[N];
        str = s.split(" ");

        int Gender = Integer.parseInt(br.readLine());
        String genderboard[][] = new String[Gender][2];


        for(int i = 0; i < Gender; i++){
            String ss = br.readLine();
            genderboard[i] = ss.split(" ");
        }
        br.close();

        System.out.println(genderboard[0][1]);
    }
}
/// 입출력까지 구현함
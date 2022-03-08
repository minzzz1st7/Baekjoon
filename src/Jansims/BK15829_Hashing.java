package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//abc 문자를 입력받았다면, 1 *31 + 2 *31 * 31 + 3 * 31 * 31 * 31를 출력

public class BK15829_Hashing {

    static final int m = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int ch;
        long hash = 0; // 해시 값

        for(int i = 0; i < l; i++){
            // a, b, ,,, z를 1, 2,,,,26 으로 나타낼 수 있다.
            ch = str.charAt(i) - 'a' + 1;
            hash += ch * hash(i);
        }
        System.out.println(hash % m);

        br.close();
    }

    private static long hash(int b) {
        return b == 0 ? 1 : 31 * hash(b -1) % m;
    }
}

package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BK1676_팩토리얼0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger factorial = BigInteger.valueOf(1);


        for(int i = 1; i <= N ; i++){
            factorial=  factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
        String s = factorial.toString();
        String sp[] = s.split("");
        int cnt = 0;
        if( N == 0 ) {}
        else{
            for(int j = sp.length-1; j >= 0 ; j--){
                if(sp[j].equals("0")) {
                cnt++;
            }
                else {
                    break;
            }
        }}
        System.out.println(cnt);
    }
}

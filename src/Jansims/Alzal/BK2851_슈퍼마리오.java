package Jansims.Alzal;


/*
* 이런 문제 난 너무 어렵다...
* 차이값을 계속 비교하면서
* 차이가 더 작은 값의 합을 저장해주는 것
* 저장해둔 것도 또 비교하고...
* 으아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK2851_슈퍼마리오 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int chai = 0;
        int sum = 0;

        for(int i = 1 ; i <= 10; i++){
            int n = Integer.parseInt(br.readLine());

            if(sum < 100){
                 sum += n;
                 if(Math.abs(chai-100) > Math.abs(sum-100)){
                     chai = sum;
                 } else if(Math.abs(chai - 100) == Math.abs(sum-100)){
                     chai = chai > sum ? chai : sum;
                 }
            }

        }
        System.out.println(chai );


        br.close();
    }
}

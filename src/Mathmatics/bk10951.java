package Mathmatics;/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/
/*
* 1. 시간을 절약하기 위해 buffered를 사용
* 2. 입력 받은 두 수를 분리하기 위해 StringTokenizer 사용
* 3. StringBuilder는 더하기 값을 한번에 산출하기 위해 사용
* 4. EOF로써 입력의 끝을 인식
* 5. 탈출 조건이 없어도 입력이 끝이면 탈출하도록
* */
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class bk10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = null;
        StringTokenizer st;
        int sum = 0;
        int a,b;

        while(( s = br.readLine()) != null && s.length() != 0){
            st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a+b;
            bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}

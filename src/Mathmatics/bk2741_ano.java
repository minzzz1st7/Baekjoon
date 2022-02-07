package Mathmatics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;     //throws IOExeption 예외처리
/* 버퍼 : 데이터를 일정 크기 단위로 묶어서 저장하는 창고
자바에서는 버퍼링된 스트림을 제공하는데 왜냐하면 문자 하나하나를 처리하기에는 오버헤드가 발생할 수 있기때문에
버퍼에 만들어진 일정한 공간에 담아서 사용한다.
 */
public class bk2741_ano {
    public static void main(String[] args) throws IOException {
        /*콘솔 입력시 BufferedReader 객체 생성*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*BufferedReader : 장치의 데이터를 읽는다. InputStreamReader은 String을 입력받겠다.*/
        int N = Integer.parseInt(br.readLine());
        /*readLine의 리턴값은 String이기때문에 int로 행변환을 위해 Interger method를사용한다.*/
        br.close();                                 //늦게 만들어진 것부터 닫는다.

        StringBuilder k = new StringBuilder();      //단일 쓰레드의 안전성을 보장하며 k라는 메모리에 데이터를 저장

        for(int i = 1; i <= N; i++){                //i는 1부터 N까지 1씩 즈악하며 반복
            k.append(i).append("\n");               //k값을 다음줄로 띄운다.
        }
        System.out.println(k.toString());           //k값을 출력한다.
    }
}



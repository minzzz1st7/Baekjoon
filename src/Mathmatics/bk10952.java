package Mathmatics;/*0 0이 들어올 때까지 A+B를 출력하는 문제 */
import java.util.*;

public class bk10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            if ( a==0 && b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}

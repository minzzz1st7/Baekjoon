import java.util.*;

public class bk2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;

        if(3<=n && n <= 5000) {

            while(true) {
                if(n % 5 == 0) {
                    System.out.println(n/5 + x);
                    break;
                } else if ( n <= 0 ){
                    System.out.println(-1);
                    break;
                }
                n -= 3;
                x ++;

            }

        } else {
            System.out.println(-1);
        }
       sc.close();

    }
}

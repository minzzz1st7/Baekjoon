import java.util.Scanner;

public class bk8393 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum =0;
        int c = in.nextInt();
        for ( int i = 1; i <=c; i ++){
            sum += i;
        }
        System.out.println(sum);

    }
}

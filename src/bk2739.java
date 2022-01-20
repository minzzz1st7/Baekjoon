import java.util.Scanner;

public class bk2739 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();

        for(int b =1; b<=9; b++){
            System.out.println(a+"*"+ b + " = " + (a*b));
        }
    }
}

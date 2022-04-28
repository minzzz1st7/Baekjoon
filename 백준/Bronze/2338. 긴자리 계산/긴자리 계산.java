import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger f_num = sc.nextBigInteger();
		BigInteger s_num = sc.nextBigInteger();
		
		System.out.printf("%d\n%d\n%d", f_num.add(s_num), f_num.subtract(s_num), f_num.multiply(s_num));
		
		sc.close();
	}
}
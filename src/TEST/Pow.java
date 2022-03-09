package TEST;

public class Pow {
    public static void main(String[] args) {
        int num1 = 3;
        for (int i = 1; i <= 10; i++){
            System.out.printf("Math.pow(%d, %d) => %f \n", num1, i, Math.pow(num1, i));
        }
    }
}

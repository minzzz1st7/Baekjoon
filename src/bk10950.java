import java.util.Scanner;

public class bk10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int arr[] =  new int[c];
//n을 입력받고 그 n만큼 반복문 돌리기
        for (int i = 0; i < c; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a+b;
//각 배열 원소마다 입력받은 a와 b를 더해서 i번째 배열에 저장하는 원리
        }
        in.close();
//배열값 출력하기
        for ( int k : arr) {
            System.out.println(k);
        }
    }
}

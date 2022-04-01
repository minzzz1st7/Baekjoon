import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] save = new long[n+1];
        save[0] = 0;
        save[1] = 1;
        
        for (int i = 2; i < save.length; i++) {
            save[i] = save[i-2] + save[i-1];
        }
        System.out.println(save[n]);
    }
}


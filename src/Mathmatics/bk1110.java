package Mathmatics;/*모르겠당...*/

import java.util.*;

public class bk1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String new_N="";
        int sum,i;

        int con_N= Integer.parseInt(N);
        //26을 넣는 곳
        if(con_N <10){
            N="0"+N;
        }
        //new_N은 새로운 값이 만들어지는.. 2+6 = 14 와 같은..
        for(i=0; !(N.equals(new_N)); i++){
            sum= con_N + con_N/10;
            new_N = Integer.toString(con_N%10)+Integer.toString(sum%10);
            con_N = Integer.parseInt(new_N);
        }
        System.out.println(i);
    }
}

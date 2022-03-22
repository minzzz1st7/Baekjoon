package Jansims;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class BK1181_GG단어정렬 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            HashSet<String> str1=new HashSet<>();
            for(int i=0;i<n;i++) {
                String A="";
                A=scan.next();
                str1.add(A);
            }

            ArrayList<String> str2=new ArrayList<>(str1); //set을 ArrayList에 담는다

            Collections.sort(str2,new Comparator<String>() {
                public int compare(String s1,String s2) {
                    if(s1.length()>s2.length())  //문자 길이로 정렬
                        return 1;
                    else if(s1.length()<s2.length())
                        return -1;
                    else // 길이가 같은 문자는 사전순으로 정렬
                        return s1.compareTo(s2);
                }
            });

            for(String s:str2) {
                System.out.println(s);
            }
        }

}

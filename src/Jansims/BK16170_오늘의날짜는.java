package Jansims;

import java.util.*;

public class BK16170_오늘의날짜는 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(cal.YEAR));
        System.out.println(cal.get(cal.MONTH));
        System.out.println(cal.get(cal.DATE));
    }
}

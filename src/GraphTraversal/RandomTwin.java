package GraphTraversal;

import java.util.Arrays;
import java.util.Collections;


public class RandomTwin {
    public static void main(String[] args) {


        String[] names =  {"강태찬","공지훈","김국진","김동우",
                "김민혁","김성빈","김유정","김정현","김태훈",
                "남한솔","박유주","박주연","박찬호","손효재","송형근","신세영","이상진",
                "이연의", "인예림","정민지","정찬우","조헌우","최지홍","황인빈"};

        Collections.shuffle(Arrays.asList(names));
        for(int i = 0; i< names.length; i+=2){
            System.out.println("-------- 짝꿍입니다----------");
            System.out.println(names[i]+"\t"+ names[i+1]);

        }
    }
}
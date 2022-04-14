package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BK2805_나무자르기 {
        public static void main(String[] args) throws IOException {

            //나무 m미터
            //절단기 높이 : h

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] tree = new int[n];

            int start = 0;
            int end = 0;

            st = new StringTokenizer(reader.readLine());
            for (int i=0; i<tree.length; i++) {
                tree[i] = Integer.parseInt(st.nextToken());
                end = Math.max(end, tree[i]);
            }

            Arrays.sort(tree);

            //mid : 절단기 높이

            int result = 0;

            while (start <= end) {

                long total = 0;
                int mid = (start+end)/2;
                System.out.println("midddddddd      "+ mid);

                for (int i=0; i<n; i++) {
                    if (tree[i] > mid) {
                        System.out.println("tree[i]    "+ tree[i]);
                        System.out.println("mid      "+ mid);
                        total += tree[i] - mid;
                        System.out.println("total       "+ total);
                    }
                }


                if (total < m) {
                    System.out.println("m보다 작아서 조절 중~~");
                    end = mid-1;
                } else {
                    System.out.println("m보다 커서 조절 중~");
                    start = mid + 1;
                    result = mid;
                    System.out.println("result    "+ result);

                }

                System.out.println("==================");
            }

            System.out.println(result);


    }
}

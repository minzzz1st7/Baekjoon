package Jansims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 처음에 Arrays.sort로 풀었다가 시간초과
// 두번째, 인덱스에 값을 넣어서 1로 만들어주고
// -1000000 ~ 10000001 까지 돌면서 1인 인덱스들 뽑아주려고 했는데
// ArrayIndexOutofBounds 가 나왔다. > 그 이유는 arr[-1] 이런 식으로 안들어가서.
// 그래서 heap으로 풀었다.
// heap 은 들어갈 때는 자유롭게 트리 형태로 들어가지만
// poll 할 때는 알아서 오름차순으로 나온다.

public class BK2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int n = 0; n < N; n++) {
            heap.add(Integer.parseInt(br.readLine()));


            for (int i = 0; i < N; i++) {
                sb.append(heap.poll()).append("\n");
            }
            System.out.println(sb);

            br.close();
        }
    }
}
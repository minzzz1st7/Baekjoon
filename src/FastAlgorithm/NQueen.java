package FastAlgorithm;

import java.util.ArrayList;

public class NQueen {

    public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol) {
        Integer currentRow = candidate.size();
        for(int index = 0; index < currentRow; index++){
            if((candidate.get(index) == currentCol) || (Math.abs(candidate.get(index)- currentCol) == currentRow-index )){
                return false;
            }
        }
       return true;
    }

    public void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate){
        // currentRow 지금 체크해야할 행이 어느 행인지
        // currentCandidate 그 위에서 선택된 퀸들을 알려주는 것
        // dfsFunc()은 재귀로 호출될 것
        //

        // 조건이 만족하는지 검사하는 핵심루트

        if(currentRow == N) { // 전체 행을 다 돌면서 각 행에서 적절한 퀸의 위치을 찾았다는 의미
            System.out.println(currentCandidate); // currentCandidate는 퀸의 적절한 위치정보를 담고 있으므로 출력해준다.
            return;
        }

        for(int index =0 ; index < N; index++ ){ // 순회하는 건데 행에 있는 모든 열의 위치를 체크하자는 의미
            if(this.isAvailable(currentCandidate, index) == true) { // 기존의 퀸의 위치들과 지금 어느 위치를 체크팔 건지 인덱스로 체크
                currentCandidate.add(index); // true는 적합하다는 의미니까 순차적으로 currentCandidate에 넣어준다
                this.dfsFunc(N, currentRow +1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() -1);
                // 가지치기를 하기 위해 마지막에 들어간 값을 삭제해 준다.
            }
        }
    }


}

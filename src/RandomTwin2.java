import java.util.Scanner;

public class RandomTwin2 {

    public void check(int[][] map) {
        int dx,dy;
        //4방향으로 탐색
        int[][]d = {{0,1},{1,-1},{1,0},{1,1}};
        //전체 위치 탐색
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[0].length;j++) {
                //현재 위치의 돌이 0이면 패쓰
                if(map[i][j]==0)
                    continue;
                //현재 위치에서 4방향으로 이동
                for(int k=0;k<d.length;k++) {
                    dx = i+d[k][0];
                    dy = j+d[k][1];
                    //현재위치에서 움직였을 때 그 위치가 오목판을 안 벗어나고 이전 돌과 같은 수인지 확인
                    if(dx>=0 && dx<map.length && dy>=0 && dy<map[0].length&&map[dx][dy]==map[i][j]) {
                        if(move(map,dx,dy,2,k)==5) {
                            //오목이 완성된 숫자 출력
                            System.out.println(map[i][j]);
                            //현재위치 기준으로 이동방향에 따른 가장 왼쪽 점 위치 구함
                            switch (k) {
                                case 0:
                                    System.out.printf("%d %d\n",i+1,j+1);
                                    break;
                                case 1:
                                    System.out.printf("%d %d\n",i+5,j-3);
                                    break;
                                case 2:
                                    System.out.printf("%d %d\n",i+1,j+1);
                                    break;
                                default:
                                    System.out.printf("%d %d\n",i+1,j+1);
                                    break;
                            }
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0);
        return;
    }   //map:오목판, x: 행 y: 열 n: 현재 연속된 알 수 direction: 탐색 방향 d배열의 인덱스
    public int move(int[][] map,int x, int y, int n,int direction) {
        //탐색 방향 오른쪽, 왼쪽아래, 아래, 오른쪽 아래
        int[][]d = {{0,1},{1,-1},{1,0},{1,1}};
        int dx=x,dy=y,count=n;
        //현재 돌이 2개 이어져 있으므로 3번만 더 탐색하면 오목 여부 판별 가능
        for(int l=0;l<3;l++) {
            //위치 이동
            dx+=d[direction][0];
            dy+=d[direction][1];
            //이동한 위치가 바둑판의 크기에서 벗어나지 않고, 현재 돌의 숫자(1 or 2)가 같은지 확인
            if(dx>=0 && dx<map.length && dy>=0 && dy<map[0].length && map[x][y]==map[dx][dy])
                count++;
            else
                return count; //다르면 그대로 종료
        }
        //5개가 이어졌을 때 육목여부 판단
        if(count==5) {

            int dx1 = x-(d[direction][0]*2);
            int dy1 = y-(d[direction][1]*2);
            dx+=d[direction][0];
            dy+=d[direction][1];
            //같은 방향으로 한칸 더 움직여서 확인
            if(dx>=0 && dx<map.length && dy>=0 && dy<map[0].length && map[x][y]==map[dx][dy])
                count++;
            //시작점이 두번째는 아닌지 확인 --> 1 1 1 1 1 1 일때 첫번째 1의 기준에선 육목인데 두번째 1의 기준에선 오목임 -> 이경우 체크
            if(dx1>=0 && dx1<map.length && dy1>=0 && dy1<map[0].length && map[x][y]==map[dx1][dy1])
                count++;
            return count;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RandomTwin2 = new RandomTwin2();
        int j=0,n = 19;
        String[] tmp;
        int[] tmpInt = new int[n];
        int[][] map = new int[n][n];
        //오목판 저장
        for(int i=0;i<n;i++) {
            tmp = sc.nextLine().split(" ");
            j=0;
            for(String c:tmp) {
                tmpInt[j++]=Integer.parseInt(c);
            }
            map[i]= tmpInt.clone();
        }
        RandomTwin2.check(map);
    }
}
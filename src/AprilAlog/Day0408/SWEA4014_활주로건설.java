package AprilAlog.Day0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA4014_활주로건설 {

    static int N,X;
    static int[][] road;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            road = new int[N][N];
            for(int i=0;i<N;i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<N;j++) {
                    road[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("#").append(tc).append(" ").append(countRoad()).append("\n");
        }
        System.out.println(sb.toString());
    }
    private static int countRoad() {

        // 건설 가능한 활주로 수(답)
        int count=0;
        // 높이가 같은 도로의 길이
        int cnt=1;
        // 활주로 건설 가능 여부
        boolean check = true;
        // 아래로 내려가는 지형인지 체크
        boolean flag = false;



        // (가로 ,세로)로 0부터 N-1까지 N번씩 수행 = 2N번
        out : for(int i=0;i<N;i++) {
            // 가로
            cnt=1;
            check = true;
            flag = false;
            width : for(int j=1;j<N;j++) {
                // 높은 도로
                if(road[i][j]>road[i][j-1]) {
                    // 높은 도로에서 내려온 도로라면 그 부분에 경사로 설치 후 flag = false 처리
                    if(flag) {
                        if(cnt<X) {
                            check = false;
                            break width;
                        }else {
                            flag = false;
                            cnt-=X;
                        }
                    }
                    // 높이 차가 2이상이면 건설 불가
                    if(road[i][j]-road[i][j-1]!=1) {
                        check = false;
                        break width;
                    }

                    // 초기화 후 계속 진행
                    if(cnt>=X) {
                        cnt = 1;
                        continue;
                    }else {
                        check = false;
                        break width;
                    }
                }
                // 같은 높이의 도로
                else if(road[i][j]==road[i][j-1]) {
                    cnt++;
                }
                //낮은 도로
                else if(road[i][j]<road[i][j-1]) {
                    // 높이 차가 2이상이면 건설 불가
                    if(road[i][j-1]-road[i][j]!=1){
                        check = false;
                        break width;
                    }

                    // 이전에 더 높은 경사로가 있었다면 cnt와 X 비교 후 경사로 설치
                    if(flag) {
                        if(cnt>=X) {
                            cnt = 1;
                        }
                        else {
                            check = false;
                            break width;
                        }
                    }
                    // 이전에 더 높은 경사로가 없었다면 flag=ture처리 (지금까지 count한 도로의 길이가 필요X - 낮은 도로의 길이가 필요)
                    else {
                        flag = true;
                    }
                    cnt = 1;
                }
            }
            if(flag) {
                if(cnt<X) {
                    check = false;
                }
            }
            if(check)
                count++;




            // 세로
            cnt=1;
            check = true;
            flag = false;
            height : for(int j=1;j<N;j++) {
                // 높은 도로
                if(road[j][i]>road[j-1][i]) {
                    // 높은 도로에서 내려온 도로라면 그 부분에 경사로 설치 후 flag = false 처리
                    if(flag) {
                        if(cnt<X) {
                            check = false;
                            break height;
                        }else {
                            // 경사로의 크기만큼 빼주기
                            flag = false;
                            cnt-=X;
                        }
                    }

                    // 높이 차가 2이상이면 건설 불가
                    if(road[j][i]-road[j-1][i]!=1) {
                        check = false;
                        break height;
                    }
                    // 초기화 후 계속 진행
                    if(cnt>=X) {
                        cnt = 1;
                        continue;
                    }else {
                        check = false;
                        break height;
                    }
                }
                // 같은 높이의 도로
                else if(road[j][i]==road[j-1][i]) {
                    cnt++;
                }
                //낮은 도로
                else if(road[j][i]<road[j-1][i]) {
                    // 높이 차가 2이상이면 건설 불가
                    if(road[j-1][i]-road[j][i]!=1) {
                        check = false;
                        break height;
                    }
                    if(flag) {
                        if(cnt>=X) {
                            cnt = 1;
                        }
                        else {
                            check = false;
                            break height;
                        }
                    }else {
                        flag = true;
                    }

                    cnt = 1;
                }
            }
            if(flag) {
                if(cnt<X) {
                    check = false;
                }
            }
            if(check)
                count++;

        }
        return count;
    }


}
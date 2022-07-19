import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 1. 입력받기
* 2. 스위치배열에 값 넣기
* 3. 성별이 남자면 인덱스의 배수만큼 상태를 바꾼다.
* 4. 여자면 현재 인덱스의 좌우 대칭이면서 가장 많은 스위치를 포함하는 구간을 스위치 상태를 바꾼다.*/
public class Main {
        public static void main(String[]args) throws IOException {

            int N, swi[], s[], Student = 0, gender = 0, num = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            N = Integer.parseInt(br.readLine());

            // 스위치배열에 값 넣기
            swi = new int[N+1];

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 1; i <= N; i++) {
                swi[i] = Integer.parseInt(st.nextToken());
                // 제대로 들어가는 거 확인 완료
            }


            // 학생 수 입력받기
            Student = Integer.parseInt(br.readLine());
            for (int i = 0; i < Student; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                gender = Integer.parseInt(st.nextToken());
                num = Integer.parseInt(st.nextToken());

                if (gender == 1) {
                    for (int j = num; j <= N; j+=num) {
                        if (swi[j] == 1){
                            swi[j] = 0;
                        }else{
                            swi[j] = 1;
                        }
                    }

                } else {
                    int cnt = 1;

                    swi[num]= swi[num]== 1? 0 : 1;
                    while(true){
                            if((num-cnt) <= 0 || (num+cnt) > N) break;
                            if(swi[num-cnt]==swi[num+cnt]){

                                if (swi[num-cnt] == 1){
                                    swi[num-cnt] = 0;
                                    swi[num+cnt] = 0;
                                }else{
                                    swi[num-cnt] = 1;
                                    swi[num+cnt] = 1;
                                }
                                cnt++;
                            }else break;

                        }

                        }
                    }
            for (int k = 1; k <=N; k++){
                System.out.print(swi[k]+" ");
                if (k % 20 == 0){
                    System.out.println();
                }

            }


           // for(int i = 1; i <= N; i++){
           //     System.out.print(swi[i]);
           // }
            br.close();
        }

    }
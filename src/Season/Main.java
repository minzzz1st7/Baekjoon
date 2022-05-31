
import java.io.IOException;
import java.util.*;

interface Opponent {
    int hunt(int opp, int turn, int opp_prev, int opp_last_pattern[][]);
}

public class Main {

    private static int DEER = 0;
    private static int RABBIT = 1;
    private static int SNAKE = 2;

    // ※ 전역변수 및 함수 사용 가능합니다.
    // ※ 단, 팀명을 앞에 prefix로 붙여주세요.
    //     ex) int seoul12_2_sum = 0;
    //     ex) int seoul12_2() { }
    // ※ 현재 상태에서 빌드 시 사용할 수 있는 API는 사용 가능합니다.
    // ※ 제출방법 : hunt 메소드, 필요한 전역변수, 전역 메소드를 포함하여 txt 파일로 만들어서 제출


    static int buulgyeong4_12_me_prev = -1;
    static int day = 0;
    static int prevCnt = 0;
    static int cnt = 0;
    static int[] prevName = new int[1];
    static Opponent Me = new Opponent() {
        public int hunt(int opp, int turn, int opp_prev, int opp_last_pattern[][]) {
            int result = DEER;
            day++;
            cnt++;

            boolean exist_deer = false;

            if(opp_last_pattern[0][0]!=-1) {
                for (int i = 0; i < 10; i++) {
                    if(opp_last_pattern[0][i]==DEER) {
                        exist_deer=true;
                        break;
                    }
                }
            }
            if(!exist_deer) result = SNAKE;

            if(buulgyeong4_12_me_prev==SNAKE&&opp_prev == SNAKE) {
                result = RABBIT;
                if(exist_deer)result = DEER;
            }
            else if(buulgyeong4_12_me_prev==SNAKE&&opp_prev==RABBIT) {
                result = SNAKE;
            }
            else if(buulgyeong4_12_me_prev==SNAKE&&opp_prev==DEER) {
                result = SNAKE;
            }
            else if(buulgyeong4_12_me_prev==RABBIT&&opp_prev==SNAKE) {
                result = SNAKE;
                if(exist_deer)result = DEER;
            }
            else if(buulgyeong4_12_me_prev==RABBIT&&opp_prev==RABBIT) {
                result = SNAKE;
            }
            else if(buulgyeong4_12_me_prev==RABBIT&&opp_prev==DEER) {
                result = SNAKE;
            }
            else if(buulgyeong4_12_me_prev==DEER&&opp_prev==SNAKE) {
                result = SNAKE;
                if(exist_deer)result = DEER;
            }
            else if(buulgyeong4_12_me_prev==DEER&&opp_prev==RABBIT) {
                result = SNAKE;
            }
            else if(buulgyeong4_12_me_prev==DEER&&opp_prev==DEER) {
                result = SNAKE;
            }

            if(cnt>0){
                prevName[0] = buulgyeong4_12_me_prev;
            }
            if(cnt > 1){
                if(prevName[0] == opp_prev){
                    prevCnt++;
                    cnt = 1;
                    prevName[0] = result;
                }
            }
            if(day == 10){
                day = 0;
                cnt = 0;
                prevCnt = 0;
            }
            if(prevCnt > 1){
                prevCnt = 0;
                if(buulgyeong4_12_me_prev == DEER) result = RABBIT;
                else if(buulgyeong4_12_me_prev == RABBIT) result = SNAKE;
                else result = DEER;
            }

            buulgyeong4_12_me_prev = result;
            return result; // 반드시 0 또는 1 또는 2로 리턴해야합니다.
        }
    };


    // 아래 Opponent1~3은 테스트용 상대 사냥꾼입니다.
    // 기본 제공 코드는 임의 수정해도 관계 없습니다.
    // 상대방 추가 시, Register 함수를 통해 상대방을 등록합니다. ex) Register("Opp1", Opponent1);
    static Opponent Opponent1 = new Opponent() {
        public int hunt(int opp, int turn, int opp_prev, int opp_last_pattern[][]) {
            Random random = new Random();
            return random.nextInt(3);
        }
    };

    static Opponent Opponent2 = new Opponent() {
        public int hunt(int opp, int turn, int opp_prev, int opp_last_pattern[][]) {
            int result = 0;
//          if(opp_prev == 0) {
//             buulgyeong4_5_result = 0;
//          }else if(opp_prev == 1) {
//             buulgyeong4_5_result = 1;
//          }else if(opp_prev == 2) {
//             buulgyeong4_5_result =2;
//          }
            boolean exist_deer = false;
            if (opp_last_pattern[0][0] != -1) {
                for (int i = 0; i < opp_last_pattern[0].length; i++) {
                    if (opp_last_pattern[0][i] == DEER) {
                        exist_deer = true;
                        break;
                    }
                }
            }
            if (exist_deer == false) {
                result = SNAKE;
            }

            if (opp_prev == 0) {
                result = 0;
            } else if (opp_prev == 1) {
                result = 1;
            } else if (opp_prev == 2) {
                result = 2;
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
            return result; // 반드시 0 또는 1 또는 2로 리턴해야합니다.

        }
    };

    static Opponent Opponent3 = new Opponent() {
        public int hunt(int opp, int turn, int opp_prev, int opp_last_pattern[][]) {
            return SNAKE;
        }
    };

    private static Opponent[] f = new Opponent[100];
    private static String[] names = new String[100];
    private static int f_inx = 0;

    static void Register (String name, Opponent func)
    {
        names[f_inx] = name;
        f[f_inx++] = func;
    }

    public static void main(String[] args) throws Exception {

        Random random = new Random();

        int[] total_score = new int[150];
        int[][][] last_pattern = new int[150][150][10]; // [팀][대전][패턴]
        int[] pattern_count = new int[150];

        Register("Me", Me);
        Register("Opp1", Opponent1);
        Register("Opp2", Opponent2);
//        Register("Opp3", Opponent3);

        for(int i=0; i<140; i++)
            for(int j=0; j<140; j++)
                for(int k=0; k<10; k++)
                    last_pattern[i][j][k] = -1;

        for(int i=1; i<f_inx; i++) {
            for(int j=0; j<f_inx; j++){

                int team_a = j % f_inx;
                int team_b = (j + i) % f_inx;

                System.out.println(String.format("[%s] vs [%s]", names[team_a], names[team_b]));

                int a_game_score = 0;
                int b_game_score = 0;

                int prev_a = -1;
                int prev_b = -1;

                int team_a_count = 0;
                int team_b_count = 0;

                int[] a_pattern = new int[10];
                int[] b_pattern = new int[10];

                for(int k=0; k<10; k++){

                    int a = f[team_a].hunt(team_b, k, prev_b, last_pattern[team_b]);
                    int b = f[team_b].hunt(team_a, k, prev_a, last_pattern[team_a]);

                    a_pattern[k] = a;
                    b_pattern[k] = b;

                    if(a == prev_a) team_a_count += a+1; else team_a_count = 0;
                    if(b == prev_b) team_b_count += b+1; else team_b_count = 0;

                    if(a != 0 && a != 1 && a != 2) team_a_count = 100;
                    if(b != 0 && b != 1 && b != 2) team_b_count = 100;

                    prev_a = a;
                    prev_b = b;

                    int a_score = 0;
                    int b_score = 0;
                    int a_bonus = 0;
                    int b_bonus = 0;

                    if(a == DEER && b == DEER) {a_score = 50; b_score = 50;}
                    else if(a == DEER && b == RABBIT) {a_score = 0; b_score = 20;}
                    else if(a == DEER && b == SNAKE) {a_score = 0; b_score = 10;}
                    else if(a == RABBIT && b == DEER) {a_score = 20; b_score = 0;}
                    else if(a == RABBIT && b == RABBIT) {a_score = 20; b_score = 20;}
                    else if(a == RABBIT && b == SNAKE) {a_score = 0; b_score = 30;}
                    else if(a == SNAKE && b == DEER) {a_score = 10; b_score = 0;}
                    else if(a == SNAKE && b == RABBIT) {a_score = 30; b_score = 0;}
                    else if(a == SNAKE && b == SNAKE) {a_score = 10; b_score = 10;}

                    a_score -= team_a_count;
                    b_score -= team_b_count;

                    a_bonus = random.nextInt(3);
                    b_bonus = random.nextInt(3);
                    a_score += a_bonus;
                    b_score += b_bonus;

                    a_game_score += a_score;
                    b_game_score += b_score;

                    System.out.println(String.format("Turn [%d] [%s:(%s)] vs [%s:(%s)] ---> score [%d] / [%d] ",
                            k+1, names[team_a], (a!=0) ? (a==2 ? "SNAKE" : "RABBIT") : "DEER",
                            names[team_b], (b!=0) ? (b == 2 ? "SNAKE" : "RABBIT") : "DEER", a_game_score, b_game_score));

                }

                for (int z = 0; z<10; z++) {
                    last_pattern[team_a][pattern_count[team_a]][z] = a_pattern[z];
                }
                for (int z = 0; z<10; z++) {
                    last_pattern[team_b][pattern_count[team_b]][z] = b_pattern[z];
                }

                pattern_count[team_a]++;
                pattern_count[team_b]++;


                total_score[team_a] += a_game_score;
                total_score[team_b] += b_game_score;

                System.out.println("<Game Result>");
                if (a_game_score == b_game_score) System.out.println("Draw\n");
                else System.out.println(String.format("Win: [%4s]!\n", a_game_score > b_game_score ? names[team_a] : names[team_b]));

            }
        }

        System.out.println("<Final score>");

        int max_inx = 0;
        int max_score = 0;

        for(int i=0; i<f_inx; i++) {

            System.out.println(String.format("[%4s] Total Score: %d", names[i], total_score[i]));

            if(max_score < total_score[i]) {
                max_inx = i;
                max_score = total_score[i];
            }
        }

        System.out.printf(String.format("<Winner: [%4s]!!!!>", names[max_inx]));
    }
}
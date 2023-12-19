package ex03;

import java.util.Arrays;
import java.util.Random;

public class Lottery_02 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int num;
        boolean isSame;

        //6바퀴 돌면서 로또 번호를 추첨할 예정
        //첫번째 바퀴는 꺼내서 추첨한 번호를 그대로 대입
        //두번째 부터는 공을 꺼내서 이전에 추첨한 모든 번호와 비교 (isSame 값 얻기)
        // isSame == true (3번 부터 다시 시작)
        // isSame == false (공 집어넣기 - 3번 부터 다시 시작)

        for (int i = 0; i < 6; i++) {
            if(i==0){
                num = r.nextInt(45) + 1;
                arr [i] = num;
                continue;
            }
            // 공을 꺼내는 코드
            num = r.nextInt(45) + 1; // i == 0 이랑 비교!!
            /**
             * 이전 번호들과 비교,
             *  i==1 (0비교)
             *  i==2 (1,0 비교)
             *  i==3 (2,1,0 비교)
             */
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[j] == num){
                    isSame = true;
                    break;
                }
            }


            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[j] == num){
                    isSame = true;
                    break;
                }
            }
        }
        System.out.println(


        );
    }
}


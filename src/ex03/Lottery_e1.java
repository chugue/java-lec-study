package ex03;

import java.util.Arrays;

public class Lottery_e1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int rand = (int)((Math.random()*45)+1);

        arr[0] = rand;

        for (int i = 1; i <6; i++) {
            rand = (int)((Math.random()*45)+1);
            arr[i]=rand;

            for (int j = 0; j < i; j++) { //비교하는 동안에는 배정된 난수가 변하면 안된다. 그래서 for문을 난수아래로
                if (arr[j] == rand){
                    i--; // 새로운 난수로 재회전하기 위해서 난수 위에 for 구문을 회전시켜준다.
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
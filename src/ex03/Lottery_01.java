package ex03;

import java.util.Arrays;
import java.util.Random;

public class Lottery_01 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int num;
        boolean isSame = false;

        for (int i = 0; i < arr.length; i++) {
            num = r.nextInt(5) + 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if((i - j) < 0) {
                    break;
                }
                if (arr[i - j] == num) {
                    isSame = true;
                    break;
                }
            }
            if (isSame = false){
                arr[i] = num;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}


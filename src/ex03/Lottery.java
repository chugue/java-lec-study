package ex03;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int rand = (int)((Math.random()*45)+1);
        arr[0] = rand;

        for (int i = 1; i <6; i++) {
            rand = (int)((Math.random()*45)+1);
            arr[i]=rand;

            for (int j = 0; j < i; j++) {
                if (arr[j] == rand){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
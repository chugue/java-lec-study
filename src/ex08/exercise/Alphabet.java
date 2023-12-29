package ex08.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.toUpperCase();
        char[] eachWord = word.toCharArray();
        int[] asciiCode = new int[eachWord.length];
        int a;
        // 문자를 숫자로 변환
        for (int i = 0; i < eachWord.length; i++) {
             a = (int)eachWord[i] - 65 ;
             asciiCode [i] = a;
        }
        for (int i = 0; i < asciiCode.length; i++) {
            int count = 0;
            for (int j = 0; j < asciiCode.length; j++) {
                if (asciiCode[i] == asciiCode [j]){
                    count++;
                }
            }
            count = count++;
            System.out.println(eachWord[i] + " : " + count + "번");
        }
    }
}

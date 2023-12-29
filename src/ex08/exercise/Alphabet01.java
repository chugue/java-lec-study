package ex08.exercise;

import java.util.Scanner;

public class Alphabet01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요: ");
        String word = scanner.nextLine().toUpperCase();

        int[] frequency = new int[26]; // 알파벳 26개에 대한 빈도수 배열

        try {
            for (char ch : word.toCharArray()) {
                int index = ch - 'A';
                frequency[index]++;
            }

            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != 0) {
                    System.out.println((char) (i + 'A') + ": " + frequency[i]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("알파벳 이외의 문자가 포함되어 있습니다.");
        }
    }
}
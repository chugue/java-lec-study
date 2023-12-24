package ex05.exercise;

import java.util.Scanner;

public class Word {
    String eng;
    String kor;

    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public static void main(String[] args) {
        Word[] words = new Word[5];
        words[0] = new Word("house", "집");
        words[1] = new Word("spider", "거미");
        words[2] = new Word("desk", "책상");
        words[3] = new Word("chair", "의자");
        words[4] = new Word("coffee", "커피");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("검색할 영어 단어를 입력하시오 : ");
            String search = sc.nextLine();

            if (search.equals("quit")) {
                break;
            }
            boolean found = false;
            for (Word a : words) {
                if (a.eng.equals(search)) {
                    found = true;
                    System.out.println(a.eng + " -> " + a.kor);
                    break;
                }
            }
            if (found == false){
                System.out.println("사전에 없는 단어입니디.");
            }
        }
    }
}

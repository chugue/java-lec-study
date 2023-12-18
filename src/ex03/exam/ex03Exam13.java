package ex03.exam;

import java.util.ArrayList;

/*
카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성보자. {"Clubs", "Diamonds", "Hearts", "Spades"}와
{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}를 가지고
있는 문자열 배열을 생성하고 이것들로부터 5장의 카드를 랜덤하게 선택하는 코드를 작성하라.
------ 출력문-------
Diamonds의 King
Clubs의 10
Spades의 9
Diamonds의 9
Spades의 3
-------------------
HINT: 0부터 99사이의 난수를 만들려면 다음과 같이 Math.random()을 호출한다.
int i = (int)(Math.random() * 100);
 */
public class ex03Exam13 {
    public static void main(String[] args) {
        String[] sym = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


        for (int i = 0; i < 5; i++) {
            int a = (int)(Math.random()*4);
            int b = (int)(Math.random()*13);
            System.out.println(sym[a]+ "의 " + cards[b]);
        }
    }
}

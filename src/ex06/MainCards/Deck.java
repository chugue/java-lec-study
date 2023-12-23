package ex06.MainCards;
import java.util.ArrayList;
import java.util.List;


public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"클럽", "다이아몬드", "하트", "스페이드"};
        String[] ranks = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append(", "); // 각 카드를 쉼표로 구분
        }
        sb.setLength(sb.length() - 2); // 마지막 쉼표 제거
        return sb.toString();
    }
}

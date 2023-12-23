package ex06.MainCards;

public class Card {
    private String suit; // '클럽', '다이아몬드', '하트', 또는 '스페이드'
    private String rank; // '에이스', '2', ..., '10', '잭', '퀸', '킹'

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}


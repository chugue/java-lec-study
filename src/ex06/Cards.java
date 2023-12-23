package ex06;

class Deck {
    public static void __str__(String name){
        System.out.println("'"+ name +  " 에이스' ,");
        System.out.println("'"+ name +  " 2' ,");
        System.out.println("'"+ name +  " 3' ,");
        System.out.println("'"+ name +  " 4' ,");
        System.out.println("'"+ name +  " 5' ,");
        System.out.println("'"+ name +  " 6' ,");
        System.out.println("'"+ name +  " 7' ,");
        System.out.println("'"+ name +  " 8' ,");
        System.out.println("'"+ name +  " 9' ,");
        System.out.println("'"+ name +  " 10' ,");
        System.out.println("'"+ name +  " 잭' ,");
        System.out.println("'"+ name +  " 퀸' ,");
        System.out.println("'"+ name +  " 킹' ,");
    }
}
class Club{
    String name;

    public Club(String name) {
        this.name = name;
    }
}
class Heart{
    String name;

    public Heart(String name) {
        this.name = name;
    }
}
class Spade{
    String name;

    public Spade(String name) {
        this.name = name;
    }
}
class Diamond{
    String name;

    public Diamond(String name) {
        this.name = name;
    }
}

public class Cards {
    public static void main(String[] args) {
        Club club = new Club("클럽");
        Heart heart = new Heart("하트");
        Spade spade = new Spade("스페이드");
        Diamond diamond = new Diamond("다이아몬드");

//        Deck.__str__(club);
//        Deck.__str__(diamond);
//        Deck.__str__(heart);
//        Deck.__str__(spade);
    }
}

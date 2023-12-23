package ex06;

class Sports {
    String getName() {
        return "아직 결정되지 않음";
    }
    int getPlayers() {
        return 0;
    }
}
public class Soccer extends Sports {
    String gameName;
    int players;

    public Soccer(String gameName, int players){
        this.gameName = gameName;
        this.players = players;
    }

    public String getName (){
        return gameName;
    }
    public int getPlayers () {
        return players;
    }
    public void print () {
        System.out.println("경기이름 : " + gameName);
        System.out.println("경기자수 : " + players);
    }
    public static void main(String[] args) {
        Soccer sc = new Soccer("축구", 11);
        sc.print();
    }

}

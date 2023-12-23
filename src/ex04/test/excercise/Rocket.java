package ex04.test.excercise;

public class Rocket {
    int x, y;

    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString (){
        System.out.println("로켓의 위치는 : (" + x +", " + y + ")" );
        return null;
    }
    public int moveUp (int a) {
        return x = x + a;
    }

    public static void main(String[] args) {
        Rocket rk = new Rocket(10, 20);
        rk.toString();
        rk.moveUp(2);
        rk.toString();
    }
}

package ex07.excercise;

class Circle implements Movable{
    @Override
    public void move() {
        int a = (int)(Math.random()*100);
        System.out.println(a + "만큼 이동하였습니다.");
    }
}
class Rectangle implements Movable{
    @Override
    public void move() {
        int a = (int)(Math.random()*100);
        System.out.println(a +"만큼 이동하였습니다.");
    }
}
public class Testable {
    public static void main(String[] args) {
        Movable[] m = new Movable[]{new Circle(), new Rectangle()};
        m[0].move();
        m[1].move();
    }
}

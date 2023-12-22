package ex06;

class Shape1 {
    public void draw() {
        System.out.println("Shape");
    }
}
class Circle1 extends Shape1 {

    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}
class Rectangle extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}
class Triangle extends Shape1 {
    public void draw() {
        System.out.println("triangle을 그립니다.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        Triangle t = new Triangle();
        Circle1 c = new Circle1();
        s.draw ();
        t.draw();
        c.draw();

    }
}

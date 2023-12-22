package ex06;

class Shape001 {
    int x, y;

    public Shape001() {
        System.out.println("Shape 생성됨");
    }
}

class Circle {
    int radius; // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
//        super.x = 1;
//        super.y = 2;
    }

    double getArea(){
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
    }
}

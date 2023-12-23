package ex05.exercise;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void equalPoint(Point p1, Point p2){
        if (p1.x == p2.x && p1.y == p2.y){
            System.out.println("p1과 p2가 같습니다.");
        } else {
            System.out.println("p1과 p2가 같지 않습니다.");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(20,40);
        Point p2 = new Point(20,40);

        Point.equalPoint(p1,p2);
    }
}

package ex05.exercise;

public class Circle {
    private int x, y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
}
    public void move (int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    public String toString(){
        return "Circle [x="+ x + ", y="+ y + ", radius =" + radius + "]";
    }

    public static void main(String[] args) {
        Circle c = new Circle(10, 10, 5);
        System.out.println(c + "\n");
        c.move(10,20);
        System.out.println("move() 호출 후");
        System.out.println(c);
    }
}

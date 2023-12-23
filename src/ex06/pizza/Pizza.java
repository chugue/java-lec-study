package ex06.pizza;

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }

}
public class Pizza extends Circle {
    public String name;

    public Pizza(String name, int r) {
        super(r);
        this.name = name;
    }

    public void print () {
        System.out.println("피자의 종류 : "+ name + ", 피자의 크기 : " + radius);
    }
    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);
        obj.print();
    }
}

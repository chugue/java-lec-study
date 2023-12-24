package ex05.exercise;

public class Square {
    private int radius;

    public Square(int radius) {
        this.radius = radius;
    }
    public String toString(){
        return "Circle [radius = "+ this.radius+"]";
    }

    public static void main(String[] args) {
    Square[] list = new Square[3];
        for (int i = 0; i < 3; i++) {
            int rand = (int)(Math.random()*100);
            list[i] = new Square(rand);
            System.out.println(list[i]);
        }
    }
}

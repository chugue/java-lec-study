package ex04;

class Bird {
    double weight;
    String colors;

    Bird(double weight, String colors) {
        this.weight = weight;
        this.colors = colors;
    }

    public void eat() {
        this.weight++;
    }
}
public class PracticeEx01 {
    public static void main(String[] args) {
    Bird b1 = new Bird(5.5, "빨강");
    Bird b2 = new Bird(5.0, "하얀");

    b1.eat();
        System.out.println(b1.weight);
        System.out.println(b2.weight);
    }
}

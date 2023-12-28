package ex07.excercise;

public class Duck implements Drawable, Animal{
    @Override
    public void walk() {
        System.out.print("걸을 수 있음,");
    }
    @Override
    public void fly() {
        System.out.print(" 날 수 있음,");
    }
    @Override
    public void sing() {
        System.out.print(" 노래할 수 있음,");
    }
    @Override
    public void draw() {
        System.out.print(" 그릴 수 있음,");
    }
    public String toString(){
        return "Duck은 ";
    }
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.print(duck);
        duck.walk();
        duck.fly();
        duck.sing();
        duck.draw();

    }


}

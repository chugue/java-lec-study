package ex07.excercise;

interface Animal {
    void walk();
    void fly();
    void sing();
}

public class Bird implements Animal{
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

    public String toString(){
        return "Bird는 ";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.print(bird);
        bird.walk();
        bird.fly();
        bird.sing();
    }

}

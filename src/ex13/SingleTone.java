package ex13;
public class SingleTone {

    private static SingleTone instance = new SingleTone();

    // private 생성자
    private SingleTone() {
    }

    public static SingleTone getInstance() {
        return instance;
    }
}

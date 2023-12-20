package ex04;

class A {
    private int a;
    int b;
    public int c;
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();

//        obj.a = 10; // 다른 클래스에서 private은 접근 하지 못함
        obj.b = 20; // 디폴트 멤버는 접근 가능
        obj.c = 30; // 공용 멤버는 접근할 수 있음.
    }
}

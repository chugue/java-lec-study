package ex06.test;

class A {
    public A() {
        System.out.println("클래스 A 생성자");
    }
}
class B extends A{
    public B() {
        System.out.println("클래스 B 생성자");
    }
}

public class Test {
    public static void main(String[] args) {
        B b = new B();
    }
}


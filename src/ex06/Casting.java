package ex06;

class Parent {
    void print(){
        System.out.println("Parent 메소드 호출");
    }
}
class Child extends Parent {
    void print(){
        System.out.println("Child 메소드 호출");
    }
}

public class Casting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
    }
}

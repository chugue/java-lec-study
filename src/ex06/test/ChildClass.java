package ex06.test;

class ParentClass {
    public void test() {
        System.out.println("부모 클래스 test()");
    }
}
public class ChildClass extends ParentClass {
    public void test() {
        System.out.println("자식 클래스 test()");
    }
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.test();
        ParentClass obj2 = new ChildClass();
        obj2.test();
    }
}




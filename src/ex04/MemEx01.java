package ex04;

class Person1 {    // class는 즉, 여러 자료형을 품고 있는 person은 custom 자료형이라 생각하면 된다.
    static int age = 20;
    static char gender = '여';    // int,char는 primitive 자료형
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);

    }
}

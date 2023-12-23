package ex04.test;

public class ScopeEx01_01 {

    int n1 = 1;
    static int n2 = 2;

    static void m1(){
        int n5 = 10;
        System.out.println("m1 : " + n5);
    }

    void m2() {
        System.out.println("m2 : " + n1);
    }

    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01_01 sc = new ScopeEx01_01();
        System.out.println(sc.n1);
        sc.m2();
    }
}

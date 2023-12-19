package ex04;

public class MethodEx01_01 {

    void m1(){
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2");
        return "m2";
    }

    public static void main(String[] args) {
        MethodEx01.m1();
        String result = m2();
        System.out.println("result : " + result);

    }
}

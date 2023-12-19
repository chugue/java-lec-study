package ex04;

public class MethodEx02 {

    static void m3(int n1) {// 파라메터 한개
        System.out.println("m3 : " + n1);
    }

    static void m4(int n1, int n2){// parameter 두개 : 매개변수를 받는 (투입구)
        System.out.println("m4 : " + n1);
        System.out.println("m4 : " + n2);
    }

    public static void main(String[] args) {
        m3(1);
        m4(1,2); // 아규먼트 (동전)

    }
}

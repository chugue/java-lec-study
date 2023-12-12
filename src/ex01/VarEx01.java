package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1 ; // +-21억까지 들어간다. (4Byte)
        double d1 = 1.5; // +- 21억과 소수점까지 들어간다. (8Byte)
        long big1 = 20000000000L; // 경까지 가능! (8Byte)
        boolean b1 = true; // true (참), false (거짓)
        char c1 = '가'; // 한글 하나, 영어 한자 저장가능

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    }  // 자바 프로그램 종료 - 자바 생명주기
}

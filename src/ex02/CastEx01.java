package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2; // 변수이기 때문에 4칸의 메모리에 2가 들어가 있는 상황이다.

        d1 = n1; // 업 캐스팅 (묵시적 형변환)
        System.out.println(d1);

        n1 = (int) d1;
        System.out.println(n1);  // 다운 캐스팅
    }
}

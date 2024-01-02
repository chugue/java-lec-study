package ex08.example02;


public class TryEx01_v01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없어요");
        } finally {
            System.out.println("계산이 끝났습니다.");
        }
    }
}

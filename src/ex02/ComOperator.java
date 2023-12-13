package ex02;

public class ComOperator {
    public static void main(String[] args) {
        System.out.println((3 == 4) + " ");
                // 3 과 4 가 같으면 true를 반환한다
        System.out.println((3 != 4) + " ");
                // 3 과 4가 다르면 true를 반환한다.
        System.out.println((3 > 4) + " ");
                // 3 이 4보다 크면 true를 반환한다.
        System.out.println((4 > 3) + " ");
                // 4가 3보다 크면 true를 반환한다.
        System.out.println((3 == 3 && 4 ==7) + " ");
                // 3이 3과 같다 와 4 와 7이 같다 둘다 참일 경우에만 true 반환
        System.out.println((3 == 3 || 4 == 7) + " ");
                // 3이 3과 같다 와 4와 7이 같다 중 둘 중 하나라도 참이라면 true 반환
    }
}




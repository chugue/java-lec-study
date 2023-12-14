package ex03;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i; // 누적함수 sum = sum + i랑 같은 의미
        }
        System.out.println("1부터 10까지의 정수의 합 = " + sum);
    }
}

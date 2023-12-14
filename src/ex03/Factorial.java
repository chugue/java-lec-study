package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1 ; // factorial은 변수를 모두 곱하는 것이기 때문에 값이 매우 커질수 있으므로
                        // long으로 선언을 해줘야된다. 그리고 fact를 0으로 초기화 하지 않는 이유는
                        // 곱셉에서 0과의 곱셈은 모든 값이 0이 되기 때문이다. 그래서 1로 초기화한다.
        int n;

        System.out.print("정수를 입력하시오");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }
        System.out.println(n + "은 "+ fact + "입니다.");
    }
}

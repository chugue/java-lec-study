package ex03;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int n = scan.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for (int i = 1; i <= n; i++) {  // int가 0으로 초기화 되어있는 상태에서 양수를 나눌수 없으므로,
                                        // 초기화는 1로 설정한다.
            if (n % i == 0) { // 약수란 그 수를 나눌수 있는 정수, 즉 나머지값이 0이 나오는 수
                System.out.print(" " + i);
            }
        }
    }
}

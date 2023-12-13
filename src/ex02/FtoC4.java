package ex02;

import java.util.Scanner;

public class FtoC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==========================");
        System.out.println();

        System.out.print("번호를 선택하시오 : ");  // ln을 지우고 그 옆에 같이 넣는게 좋을 것같다.
        int selectedNum = sc.nextInt();

        System.out.print("온도를 선택하시오 : ");  // 여기도 ln삭제
        double temp = sc.nextDouble();

        double result =
                selectedNum == 1 ? (5.0 / 9.0 * (temp - 32)) : (9.0 / 5.0 * temp + 32);

        System.out.println("온도는 : " + result);
    }
}

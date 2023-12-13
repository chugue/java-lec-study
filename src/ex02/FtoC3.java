package ex02;

import java.util.Scanner;

public class FtoC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨 (국제표준)온도를 입력하시오");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
        //System.out.prinln(f);

        // 2. 섭씨 -> 화씨 온도로 변환
        double result = 9.0 / 5.0 * temp + 32;
        System.out.println(result);
    }
}
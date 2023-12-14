package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx08 {
    public static void main(String[] args) {
        double pi = 3.141593;

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 소수점 한자리까지 입력해주세요 : ");
        double radius = sc.nextDouble();

        double volume = (4 / 3) * pi * (radius * radius * radius);
        System.out.println("요청하신 구의 부피는 "+ volume +"입니다.");
    }
}

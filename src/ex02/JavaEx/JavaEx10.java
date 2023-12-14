package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("물체의 무게를 입력하시오 : ");
        int weight = sc.nextInt();

        System.out.print("물체의 속도를 입력하시오 : ");
        int speed = sc.nextInt();

        double energy = 0.5 * (double)weight * ((double)speed * (double)speed);
        System.out.println("물체는" + energy + "(줄)의 에너지를 가지고 있다.");
    }
}

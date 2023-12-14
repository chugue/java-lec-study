package ex03;

import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;

        do{
            System.out.println("제가 태어난 월을 맞춰보세요 [1-12] : ");
            month = sc.nextInt();
        } while (month != 11 ); // 11이 아닌동안은 계속 반복 while구문이 true일경우 반복
        System.out.println("제가 태어난 달은 " + month + "월 입니다.");
    }
}

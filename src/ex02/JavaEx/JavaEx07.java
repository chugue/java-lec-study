package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx07 {
    public static void main(String[] args) {
        double taxrate = 0.1;

        Scanner sc = new Scanner(System.in);

        System.out.print("상품금액을 입력해주세요: ");
        int price = sc.nextInt();

        System.out.print("지불금액을 입력해주세요 : ");
        int received = sc.nextInt();

        int change = received - price;
        int tax = (int)(price * taxrate);

        System.out.println("잔돈은 "+ change +"이고, 부가세는 "+ tax +"입니다.");
    }
}

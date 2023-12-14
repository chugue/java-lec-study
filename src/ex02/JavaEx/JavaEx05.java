package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx05 {
    public static void main(String[] args) {
        int soundSpeed = 340;
        int distance = 2100;

        Scanner sc = new Scanner(System.in);
        System.out.print("소리를 듣는데 걸린 시간을 입력하세요 : ");
        int second = sc.nextInt();

        int lightning = (distance / soundSpeed) * second;
        System.out.println("번개로부터의 거리는 : " + lightning + "km");
    }
}

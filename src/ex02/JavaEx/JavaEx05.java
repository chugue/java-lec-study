package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx05 {
    public static void main(String[] args) {
        int soundSpeed = 340;
        int distance = 2100;

        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        int lightning = (distance / soundSpeed) * second;
        System.out.println("번개로부터의 거리는 : " + lightning);
    }
}

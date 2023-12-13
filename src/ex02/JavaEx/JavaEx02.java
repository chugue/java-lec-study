package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx02 {
    public static void main(String[] args) {
        double mile = 1.609;
        double kilo;

        Scanner sc = new Scanner(System.in);
        kilo = sc.nextDouble() * mile;

        System.out.print(kilo);
    }
}

package ex02.JavaEx;

import java.util.Scanner;

public class JavaEx09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최대 2자리까지의 정수를 입력해주세요 :");

        int bin = sc.nextInt();

        int n7 = bin % 2 ;
        int n6 = (bin / 2) % 2;
        int n5 = (bin / 2 / 2) % 2;
        int n4 = (bin / 2 / 2 / 2) % 2;
        int n3 = (bin / 2 / 2 / 2 / 2) % 2;
        int n2 = (bin / 2 / 2 / 2 / 2 / 2) % 2;
        int n1 = (bin / 2 / 2 / 2 / 2 / 2 / 2) % 2;
        int n0 = (bin / 2 / 2 / 2 / 2 / 2 / 2 / 2) % 2;

        System.out.println("요청하신 정수의 2진수 값은");
        System.out.println(n0+" "+n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+"입니다.");
    }
}

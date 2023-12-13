package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==========================");
        System.out.println();
        System.out.print("번호를 선택하시오 : ");
        int choice = sc.nextInt();

        if (choice == 1) {  // 화씨 온도 받고 섭씨 온도로 변환
            System.out.print("화씨 온도를 입력하시오 : ");
            double f = sc.nextDouble();
            double c_temp = ((f - 32) * 5 ) / 9;

            System.out.println("섭씨 온도는 " + c_temp);
        }
        else if (choice == 2){
            System.out.print("섭씨 온도를 입력하시오 : ");
            double c = sc.nextDouble();
            double f_temp = ((c * 9) / 5) + 32;

            System.out.println("화씨 온도는 " + f_temp);
        }
        else {
            System.out.println("번호를 잘못 입력하셨습니다. ");
            System.out.println("다시 입력해주세요.");
        }
    }
}

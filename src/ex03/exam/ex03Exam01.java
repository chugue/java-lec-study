package ex03.exam;

import java.util.Scanner;
/*
사용자가 입력한 값이 1,2,..9이면 "one", "two, .. "nine"과 같이 출력하는 프로그램을 작성하라.
1~9사이가 아니면 other를 출력한다..
 */
public class ex03Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1~9사이의 정수를 입력하시면 영문으로 출력합니다.");
        System.out.print("정수를 입력해주세요 : ");
        int user = sc.nextInt();

        if (user == 1 ){
            System.out.println("'1'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'ONE'입니다. ");
        }
        if (user == 2 ){
            System.out.println("'2'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'TWO'입니다. ");
        }
        if (user == 3 ){
            System.out.println("'3'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'THREE'입니다. ");
        }
        if (user == 4 ){
            System.out.println("'4'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'FOUR'입니다. ");
        }
        if (user == 5 ){
            System.out.println("'5'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'FIVE'입니다. ");
        }
        if (user == 6 ){
            System.out.println("'6'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'SIX'입니다. ");
        }
        if (user == 7 ){
            System.out.println("'7'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'SEVEN'입니다. ");
        }
        if (user == 8 ){
            System.out.println("'8'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'EIGHT'입니다. ");
        }
        if (user == 9 ){
            System.out.println("'9'을 입력하셨습니다.");
            System.out.println("영문표기는 : 'NINE'입니다. ");
        }
        if (!(user > 0 && user < 10)){
            System.out.println("OTHERS");
        }
    }
}

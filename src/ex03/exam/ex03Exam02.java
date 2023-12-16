package ex03.exam;

import java.util.Scanner;

/*
간단한 계산기 프로그램을 작성하여 보자. 먼저 사용자로부터 하나의 문자를 입력받는다.
이어서 사용자로부터 2개의 숫자를 입력받는다. 사용자로부터 받은 문자가 '+'이면 두 수의
덧셈을, 문자가'-'이면 뺄셈을, 문자가'*'이면 곱셈을 문자가'/'이면 나눗셈을 수행하도록
작성하라. if-else문을 사용하라. 나눗셈의 경우, 분모가 0이 아닌지를 먼저 검사하여야한다.
------ 출력창 ------
연산을 입력하세요 : *
피연산자 2개를 입력하세요 : 10 20
10.0*20.0 = 200.0
-------------------
 */
public class ex03Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두개의 숫자를 입력해주세요.");
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        double first = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력해주세요 : ");
        double second = sc.nextDouble();

        System.out.println("(+,-,*,/)중 원하시는 연산을 입력하세요 : ");
        char cal = sc.next().charAt(0);

        if (cal == '*'){
            double mul = first * second;
            System.out.println(first +" * "+ second +" = " + mul );

        }else if (cal == '+'){
            double add = first + second;
            System.out.println(first +" + "+ second +" = " + add );

        }else if (cal == '-'){
            double sub = first - second;
            System.out.println(first +" - "+ second +" = " + sub );

        }else if (cal == '/'){
            double div = first / second;
            System.out.println(first +" / "+ second +" = " + div );

        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}

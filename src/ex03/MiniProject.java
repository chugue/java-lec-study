package ex03;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = (int)(Math.random()*100);
        int guess = 0;
        int count = 0;

        System.out.println("숫자 추측게임에 오신걸 환영합니다.");

        do {
            System.out.print("1~100사이의 숫자를 입력해주세요 : ");
            guess = sc.nextInt();
            if (guess > computer) {
                System.out.println("제시한 수보다 낮습니다.");
                System.out.println("다시 시도해주세요.");
                count++;
                System.out.println("총 시도횟수는" + count + "입니다.");
                System.out.println();
            } else if (guess < computer) {
                System.out.println("제시한 수보다 높습니다.");
                System.out.println("다시 시도해주세요.");
                count++;
                System.out.println("총 시도횟수는" + count + "입니다.");
                System.out.println();
            } else if (guess == computer) {
                count++;
                System.out.println("축하합니다. 정답입니다.");
                System.out.println("정답은 " + computer + "였습니다.");
                System.out.println("총 시도횟수는" + count + "입니다.");
                System.out.println();
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("다시 입력해주세요.");
                System.out.println();
                continue;
            }
        }while (guess != computer);
    }
}

package ex08.exercise.rps;

import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = (int) (Math.random() * 3);
        System.out.println("하나를 선택하세요 : 가위(0), 바위(1), 보(2), 종료(-1)");
        while (true) {
            int user = sc.nextInt();
                if (user == 0 && com == 1) {
                    System.out.println("컴퓨터가 바위를 냈습니다.");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (user == 0 && com == 2) {
                    System.out.println("컴퓨터가 보를 냈습니다.");
                    System.out.println("사용자가 이겼습니다.");
                }
                if (user == 0 && com == 0) {
                    System.out.println("컴퓨터가 가위를 냈습니다.");
                    System.out.println("비겼습니다.");
                }
                if (user == 1 && com == 1) {
                    System.out.println("컴퓨터가 바위를 냈습니다.");
                    System.out.println("비겼습니다.");
                }
                if (user == 1 && com == 2) {
                    System.out.println("컴퓨터가 보를 냈습니다.");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (user == 1 && com == 0) {
                    System.out.println("컴퓨터가 가위를 냈습니다.");
                    System.out.println("사용자가 이겼습니다.");
                }
                if (user == 2 && com == 1) {
                    System.out.println("컴퓨터가 가위를 냈습니다.");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (user == 2 && com == 2) {
                    System.out.println("컴퓨터가 보를 냈습니다.");
                    System.out.println("비겼습니다.");
                }
                if (user == 2 && com == 0) {
                    System.out.println("컴퓨터가 바위를 냈습니다.");
                    System.out.println("사용자가 이겼습니다.");

                }
                if ( user > 2) {
                    System.out.println("유효한 선택이 아닙니다.");
                }
                if (user < 0 ) {
                    System.out.println("가위바위보 게임을 종료합니다.");
                    break;
                }
        }
    }
}
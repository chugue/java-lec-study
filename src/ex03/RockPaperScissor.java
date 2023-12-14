package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int Scissor = 0;
    final int Rock = 1;
    final int Paper = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2) : ");
        int user = sc.nextInt();
        int computer = (int)(Math.random() * 3); //Random함수는 새로 객체를 생성해야되고, 시스템내부클래스인 Math를 사용

        if (user == computer){
            System.out.println("닝겐과 컴퓨터가 비겼음");
        }else if (user == (computer + 1) % 3){ // 가위바위보 로직 따로 다시 공부해볼것
            System.out.println("인간 : " + user + " 컴퓨터 : " + computer + "---> 인간승리 ");
        }else {
            System.out.println("인간 : " + user + " 컴퓨터 : " + computer + "---> 컴퓨터승리 ");
        }
    }
}

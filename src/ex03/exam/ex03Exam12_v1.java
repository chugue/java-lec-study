package ex03.exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
다음과 같이 학생들의 성적을 받아서 배열에 저장했다가 합계와 평균을 구하는 프로그램을 작성하라.
-1이 입력되면 반복을 종료한다.
------출력문--------
성적을 입력하세요 : 10
성적을 입력하세요 : 20
성적을 입력하세요 : 30
성적을 입력하세요 : -1
합계 : 60
평균 : 20.0
-------------------
 */
public class ex03Exam12_v1 {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a;

        while (true) {
            System.out.print("성적을 입력하세요 : ");
            score.add(a = sc.nextInt());
            if (a < 0) {
                break;
            }
        }


//        int sum = 0;
//        for (Integer list : score){
//            sum = sum + (int)list;
//        }
//        double div = sum /score.size();
//        System.out.println("합계 : " + sum);
//        System.out.println("평균값 : " + div);

    }
    }

package ex03.exam;
/*
1부터 100 사이의 정수 중에서 3 또는 4의 배수의 합을 계산하는 프로그램을 작성하라.
----- 출력문 -----
3 또는 4의 배수의 합 : 2551
-----------------
1.3의 배수의 정수를 구하고 합구하기
2.4의 배수의 정수를 구하고 합구하기
3.3의 배수이면서 4의배수인 중복 숫자 합 더해서 총합에 빼기
 */
public class ex03Exam04 {

    public static void main(String[] args) {
        int thSum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0){
                thSum = thSum + i ;
            }
        }
        int fSum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0){
                fSum = fSum + i ;
            }
        }
        int twSum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0 && i % 3 == 0){
                twSum = twSum + i ;
            }
        }
        System.out.println(thSum + fSum - twSum);
    }
}

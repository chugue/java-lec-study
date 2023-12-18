package ex03.exam;
/*
3x5크기의 2차원 배열을 생성하고 0으로 초기화한다. 여기에 5개의 정수 1를 랜덤하게
배열에 배치해보자 (난수를 인덱스로 사용한다). 최종 배열을 화면에 출력한다.
-----출력문------
0 1 0 0 0
0 1 1 0 0
1 0 0 1 0
----------------
 */
public class ex03Exam15 {
    public static void main(String[] args) {
        int[][] a = new int[3][5];
        // Math.random은 0부터 1까지의 실수를 반환하므로 5를 곱하기 전에 형변환을 하면 항상 0이 나온다.
        for (int i = 0; i <= 5; i++) {
            int rand1 = (int) (Math.random() * 3);
            int rand2 = (int) (Math.random() * 5);
            a[rand1][rand2] = 1;
        }
        for (int i = 0; i < 3; i++) {
            for (int b : a[i]) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
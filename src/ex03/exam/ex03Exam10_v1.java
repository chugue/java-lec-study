package ex03.exam;
/*
{1.0, 2.0, 3.0, 4.0} 과 같은 초기값을 가지는 double형의 배열을 생성한다. 모든 배열 요소를
출력한 후에 모든 요소를 더하여 합을 출력하고 요소 중에서 가장 큰 값을 찾아서 출력하는
프로그램을 작성하라.
--------출력문--------
1.0 2.0 3.0 4.0
합은 10.0
최대값은 4.0
---------------------
1. double배열 만들기   2. 모든 배열 출력하기
3. 모든 요소를 더해서 합을 출력하기 4. 요소 중 가장 큰값 찾아서 출력
 */
public class ex03Exam10_v1 {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0};
        double sum = 0;
        boolean max = false;

        for (double print : a) {
            System.out.print(print + " ");
        }
        for (int i = 0; i < 4; i++) {
            sum = sum + a[i];
        }


    }
}

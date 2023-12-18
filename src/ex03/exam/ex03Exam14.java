package ex03.exam;
/*
다음과 같은 2차원 배열을 순회하면서 전체 요소 값을 화면에 출력하는 프로그램을 작성하라.
int[][] a = { {1,2,3}, {1,2}, {1}, {1,2,3} };
--------출력문 ---------
1 2 3
1 2
1
1 2 3
-----------------------
 */
public class ex03Exam14 {
    public static void main(String[] args) {
    int[][] a = new int[4][];
    a[0] = new int[] {1, 2, 3};
    a[1] = new int[] {1, 2};
    a[2] = new int[] {1};
    a[3] = new int[] {1,2,3};

        for (int i = 0; i < 4; i++) {
            for (int lagged : a[i]){
                System.out.print(lagged + " ");
            }
            System.out.println();
        }
    }
}

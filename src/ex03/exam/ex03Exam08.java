package ex03.exam;
/*
피타고라스의 정리는 직각 삼각형에서 직각을 낀 두 변의 길이를 a,b라고 하고, 빗변의 길이를 c라고 하면
a^2 + b^2 = c^2의 수식이 성립한다는 것이다. 각 변의 길이가 100보다 작은 삼각형 중에서
피타고라스의 정리가 성립하는 직각 삼각형은 몇 개나 있을까? 3중 반복문을 이용하여
피타고라스의 정리를 만족하는 3개의 정수를 찾도록 한다.
-----출력문-----
3 4 5
4 3 5
5 12 13
..
---------------
1. a, b, c 모두 0~100 사이의 수이어야 한다.

 */
public class ex03Exam08 {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            boolean tri = false;
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    if (((a * a) + (b * b)) == (c * c)) {
                        tri = true;
                        if (tri){
                            System.out.println(a + " " + b + " " + c + " ");
                        }
                    }
                }
            }
        }
    }
}
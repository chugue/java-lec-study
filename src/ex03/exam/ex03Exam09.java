package ex03.exam;
/*
피보나치 수열은 당므과 같이 정의되는 수열이다.
F(n) = 0
F(1) = 1
F(i+1) = f(i) + f(i-1)  for i = 1,2,...
피보나치 수열에서는 앞의 2개의 원소를 합하여 뒤의 원소를 만든다. 피보나치 수열에서 처음
몇 개의 원소를 나열하면 다음과 같다.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,....
피보나치 수열은 컴퓨터에서도 탐색 문제 등에 사용되기도 한다.
반복문을 이용하여 피보나치 수열을 구하는 프로그램을 작성해보자.
--------- 출력문 ---------
출력할 항의 개수 : 10
0 1 1 2 3 4 5 8 13 21 34
-------------------------
1. f(i) + f(i-1) = f(i+1)
2. 10번 순회
3. 현재 자리와 전자리를 더해서 다음 값을 낸다.
 */
public class ex03Exam09 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) { // 바로 공식 대입하기에는 a[-1]이 떠서 배열 0은 만들어 놓고 아래에서 1부터 시작.
            a[i] = i;
            for (int  j= 1; j < 9; j++) { // j의 범위가 i한계 범위랑 같으면 out of bounds가 나옴.
                a[j + 1] = a[j - 1] + a[ j ];
             }
        }
        for (int pivo : a) {
            System.out.print(pivo + " ");
        }
    }
}

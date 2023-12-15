package ex03.test;

public class BubbleEx01 {

    static void bubble(int[] arr){
        final int N = arr.length;
        int temp;
        //버블 정렬 알고리즘
        for (int loop = 1; loop < N; loop++) {
            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        // 출력코드
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        bubble(arr);
        System.out.println();

        int[] arr2 = {3, 4, 6, 7, 1, 0, 50, 39, 2, 1};
        bubble(arr2);
    }
}
/*
 * 5, 8, 2, 4, 3 (N)
 * 회전수 : N-1
 * 1회전 비교 횟수: N-1
 * 2회전 비교 횟수: N-2
 * 3회전 비교 횟수: N-3
 * 4회전 비교 횟수: N-4
 *
 *
 * [1회전] 5, 8, 2, 4 , 3  (length -1: 4번) 비교
 * 1. 5, 8  비교 (변화없음)
 * 2. 8, 2  비교 (5, 2, 8, 4, 3)
 * 3. 8, 4  비교 (5, 2, 4, 8, 3)
 * 4. 8, 3  비교 (5, 2, 4, 3, 8)
 * - 5항목을 가지고 4번 돌게 되었다.
 *
 * [2회전] 5, 2, 4, 3, 8 (length -1: 3번) 비교
 * 1. 5,2 비교 (2,5,4,3,8)
 * 2. 5,4 비교 (2,4,5,3,8)
 * 3. 5,3 비교 (2,4,3,5,8)
 *
 * [3회전] 2, 4, 3, 5, 8 (2번 비교)
 * 1. 2,4 비교 (2,4,3,5,8)
 * 2. 4,3 비교 (2,3,4,5,8)
 *
 * [4회전] 2,3,4,5,8 (1번비교)
 * 1. 2,3 비교 (2,3,4,5,8)
 */

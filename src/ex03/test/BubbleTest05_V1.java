package ex03.test;

/*
 * 5, 8, 2, 4, 3 (N)
 * 회전수 : N-1
 * 1회전 비교 횟수: N-1
 * 2회전 비교 횟수: N-2
 * 3회전 비교 횟수: N-3
 * 4회전 비교 횟수: N-4
 *
 */
public class BubbleTest05_V1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int temp;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int k = 0; k < N; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}


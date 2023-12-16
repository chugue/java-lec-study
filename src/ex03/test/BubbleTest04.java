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
public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        if (arr[2] > arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        if (arr[3] > arr[4]){
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }   // 코드를 잘 보면 변수이외에는 코드가 변함이 없다. 복붙이 가능하다.

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

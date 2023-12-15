package ex03.test;

public class BubbleTest07 {

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

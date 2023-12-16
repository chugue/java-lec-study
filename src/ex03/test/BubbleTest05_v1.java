package ex03.test;

public class BubbleTest05_v1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int temp;

        for (int i = 0; i < N - 1 ; i++) { // 반복안에 반복문을 가져온다.
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int k = 0; k < 5; k++) { //출력코드
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
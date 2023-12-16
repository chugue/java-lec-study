package ex03.test;

public class BubbleEx01 {
    public static void main(String[] args) {
        int[] arr = {99, 18, 12, 5, 8, 2, 4, 3, 9, 11};
        final int N = arr.length;
        int temp;

        for (int i = 0; i < N - 1 ; i++) { // 버블정렬 알고리즘 코드 블럭
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int k = 0; k < arr.length; k++) { //출력코드
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}

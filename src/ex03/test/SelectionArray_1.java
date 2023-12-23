package ex03.test;

public class SelectionArray_1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3, 9, 10, 1, 7};
        int N = arr.length;
        int temp;

        for (int j = 0; j < N; j++) {
            for (int i = j + 1; i < N; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}

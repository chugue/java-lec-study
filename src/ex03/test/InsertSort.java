package ex03.test;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4, 7, 19, 20, 1};
        int a = arr.length;
        int temp = 0;

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a; j++) {
                int z = i - j - 1;
                if (z < 0) {
                    break;
                }
                if (arr[i - j] < arr[z]) {
                    temp = arr[i - j];
                    arr[i - j] = arr[z];
                    arr[z] = temp;
                }
            }
        }
        for (int q : arr) {
            System.out.print(q + " ");
        }
    }
}

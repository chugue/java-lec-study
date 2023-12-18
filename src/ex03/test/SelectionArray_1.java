package ex03.test;

public class SelectionArray_1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        int temp;


        for (int i = 1; i < 5; i++) {
            if (arr[0] > arr[i]){
                temp = arr [0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 1; i < 5; i++) {
            if (arr[0] > arr[i]){
                temp = arr [0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}

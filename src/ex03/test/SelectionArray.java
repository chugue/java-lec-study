package ex03.test;

public class SelectionArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        int temp;



        if (arr[0] > arr[1]){
            temp = arr [0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[0] > arr[2]){
            temp = arr [0];
            arr[0] = arr[2];
            arr[2] = temp;
        }
        if (arr[0] > arr[3]){
            temp = arr [0];
            arr[0] = arr[3];
            arr[3] = temp;
        }
        if (arr[0] > arr[4]){
            temp = arr [0];
            arr[0] = arr[4];
            arr[4] = temp;
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}

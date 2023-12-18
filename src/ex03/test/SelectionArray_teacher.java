package ex03.test;

public class SelectionArray_teacher {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        final int rep = 0;
        int min = rep;

        if (arr[0] > arr[1]){ // 5 8 2 4 3
            min = 1;
        }
        if (arr[0] > arr[2]){ // 5 8 2 4 3 -> min = 2
            min = 2;
        }
        if (arr[2] > arr[3]){ // 5 8 2 4 3 -> min = 2
            min = 3;
        }
        if (arr[2] > arr[4]){
            min = 4;
        }
        if (rep!=min){
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;

        }


        // 변경해야될 위치 5 -> replace -> rep
        // 변경해야될 위치 8 -> min -> min
    }
}
